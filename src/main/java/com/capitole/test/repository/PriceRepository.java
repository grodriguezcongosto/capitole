package com.capitole.test.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capitole.test.entity.Price;

public interface PriceRepository extends JpaRepository<Price, UUID> {

    Optional<List<Price>> findByStartDateLessThanEqualAndEndDateGreaterThanEqualAndBrandIdAndProductId(LocalDateTime startDate, LocalDateTime endDate, Long brandId, Long productId);
    
}
