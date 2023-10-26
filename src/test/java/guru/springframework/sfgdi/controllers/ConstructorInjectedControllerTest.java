package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {

        GreetingService greetingService = new ConstructorGreetingService();

        controller = new ConstructorInjectedController(greetingService);
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}