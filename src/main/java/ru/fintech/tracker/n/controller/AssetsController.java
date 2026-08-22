package ru.fintech.tracker.n.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.fintech.tracker.n.dto.AssetsResponse;
import java.math.BigDecimal;

@RestController
public class AssetsController {
    @GetMapping("/assets")
    public AssetsResponse showAssets(){
        return new AssetsResponse(
                "USD",
                BigDecimal.valueOf(100)
        );
    }
}
