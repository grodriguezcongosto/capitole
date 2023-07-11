package com.capitole.test.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Component;

import com.capitole.test.entity.Price;
import com.capitole.test.exception.PriceNotFoundException;
import com.capitole.test.repository.PriceRepository;

@Component
public class PriceDAOImpl implements PriceDAO {

    private final PriceRepository priceRepository;

    public PriceDAOImpl(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }
    @Override
    public List<Price> getPrice(LocalDateTime currentDate, Long brandId, Long productId) throws PriceNotFoundException {
        return priceRepository.findByStartDateLessThanEqualAndEndDateGreaterThanEqualAndBrandIdAndProductId(currentDate, currentDate, brandId, productId).orElseThrow(PriceNotFoundException::new);
    }
}
