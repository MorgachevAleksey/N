package ru.fintech.tracker.n.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.fintech.tracker.n.dto.HomeDto;

import java.util.List;

@RestController
public class HomeController {
    @GetMapping
    public HomeDto home(){
        return new HomeDto(List.of(
                "Привет, добро пожаловать в персональный инвестиционный симулятор!",
                "",
                "/assets - список доуступных активов"
        )
        );
    }
}
