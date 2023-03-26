package com.wlanboy.reactive.tick;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TickRouterTest {
    
    @Autowired
    private WebTestClient webTestClient;
  
    @Test
    public void testGetTick() {
        webTestClient
          // Create a GET request to test an endpoint
          .get().uri("/tick")
          .accept(MediaType.APPLICATION_JSON)
          .exchange()
          // and use the dedicated DSL to test assertions against the response
          .expectStatus().isOk()
          .expectBody(Tick.class).value(tick -> {
            assertThat(tick.text).isEqualTo("test");
      });
    }
}
