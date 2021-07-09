package com.apirest.pratica.config.modelmaper;

import lombok.Generated;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Generated
@Configuration
public class ModelMaperConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}