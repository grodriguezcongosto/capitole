package com.capitole.test.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PriceDTO {
    
    private Long productId;

    private Long brandId;

    private Long priceList;

    private Date startDate;

    private Date endDate;

    private Double price;

    private String currency;

}
