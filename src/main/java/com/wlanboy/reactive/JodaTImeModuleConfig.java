package com.wlanboy.reactive;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;

@Configuration
public class JodaTImeModuleConfig {
    @Bean
    @Primary
    public ObjectMapper objectMapper() {
        return JsonMapper.builder().addModule(new JodaModule()).build();
    }
}
