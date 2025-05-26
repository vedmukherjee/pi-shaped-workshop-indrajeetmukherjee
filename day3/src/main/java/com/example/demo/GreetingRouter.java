package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class GreetingRouter {
  @Bean
  public RouterFunction<?> routes(GreetingHandler handler) {
    return route(GET("/"), handler::hello);
  }
}
