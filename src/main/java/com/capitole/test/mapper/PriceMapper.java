package com.capitole.test.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Named;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.capitole.test.dto.PriceDTO;
import com.capitole.test.entity.Price;

import org.mapstruct.InjectionStrategy;

@Mapper(nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface PriceMapper {
    
    @Named("priceToDto")
    PriceDTO toDTO(final Price price);
}
