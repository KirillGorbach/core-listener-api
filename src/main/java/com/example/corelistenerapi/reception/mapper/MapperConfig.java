package com.example.corelistenerapi.reception.mapper;

import org.mapstruct.ReportingPolicy;

@org.mapstruct.MapperConfig(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MapperConfig {
}
