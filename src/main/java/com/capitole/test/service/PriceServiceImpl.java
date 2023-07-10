package com.capitole.test.service;

import java.time.LocalDateTime;
import java.util.Comparator;
import org.springframework.stereotype.Service;

import com.capitole.test.dao.PriceDAO;
import com.capitole.test.dto.PriceDTO;
import com.capitole.test.entity.Price;
import com.capitole.test.exception.PriceNotFoundException;
import com.capitole.test.mapper.PriceMapper;

@Service
public class PriceServiceImpl implements PriceService {

    private final PriceDAO priceDAO;

    private final PriceMapper priceMapper;

    public PriceServiceImpl(PriceDAO priceDAO, PriceMapper priceMapper) {
        this.priceDAO = priceDAO;
        this.priceMapper = priceMapper;
    }

    @Override
    public PriceDTO getPrice(LocalDateTime currentDate, Long brandId, Long productId) throws PriceNotFoundException {
        
        return priceDAO.getPrice(currentDate, brandId, productId)
                    .stream()
                    .max(Comparator.comparing(Price::getPriority))
                    .map(priceMapper::toDTO)
                    .orElseThrow(PriceNotFoundException::new);
    }
}
