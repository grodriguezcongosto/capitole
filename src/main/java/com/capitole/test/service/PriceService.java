package com.capitole.test.service;

import java.time.LocalDateTime;

import com.capitole.test.dto.PriceDTO;
import com.capitole.test.exception.PriceNotFoundException;

public interface PriceService {

    PriceDTO getPrice(LocalDateTime currentDate, Long brandId, Long productId) throws PriceNotFoundException;
    
}
