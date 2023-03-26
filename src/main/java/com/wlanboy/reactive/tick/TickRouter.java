package com.wlanboy.reactive.tick;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration(proxyBeanMethods = false)
public class TickRouter {
    
    @Bean
    public RouterFunction<ServerResponse> route(TickHandler handler) {
  
      return RouterFunctions
        .route(GET("/tick").and(accept(MediaType.APPLICATION_JSON)), handler::getTick);
    }
}
