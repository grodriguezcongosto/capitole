package com.capitole.test.controller;

import java.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capitole.test.dto.PriceDTO;
import com.capitole.test.exception.PriceNotFoundException;
import com.capitole.test.service.PriceService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/capitole/prices")
@RequiredArgsConstructor

public class PriceController {
    
    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    private final PriceService priceService;

    @Operation(summary = "Get price by brand, product and start date")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "Invalid parameters."),
            @ApiResponse(responseCode = "404", description = "Price not found."),
            @ApiResponse(responseCode = "500", description = "Internal error.") })
    @GetMapping(value = "/brands/{brandId}/products/{productId}/price")
    public ResponseEntity<PriceDTO> getPrice(@RequestParam("startDate") 
                                             @DateTimeFormat(pattern = DATE_FORMAT) LocalDateTime currentDate, 
                                             @PathVariable(value = "brandId") Long brandId, 
                                             @PathVariable(value = "productId") Long productId) throws PriceNotFoundException {
        return ResponseEntity.ok(priceService.getPrice(currentDate, brandId, productId));
    }

}
