package com.wlanboy.reactive.tick;

import java.time.LocalDateTime;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Component
public class TickHandler {
    
    public Mono<ServerResponse> getTick(ServerRequest request) {
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
          .bodyValue(new Tick("test", LocalDateTime.now()));
      }
}
