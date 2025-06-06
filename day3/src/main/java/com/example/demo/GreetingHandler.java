package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class GreetingHandler {
  
  public Mono<ServerResponse> hello(ServerRequest request) {
    return ServerResponse.ok().bodyValue("Hello WebFlux!");
  }
}
