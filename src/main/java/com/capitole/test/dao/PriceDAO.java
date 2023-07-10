package com.capitole.test.dao;

import java.time.LocalDateTime;
import java.util.List;

import com.capitole.test.entity.Price;
import com.capitole.test.exception.PriceNotFoundException;

public interface PriceDAO {

    List<Price> getPrice(LocalDateTime currentDate, Long brandId, Long productId) throws PriceNotFoundException;
    
}
