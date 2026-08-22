package ru.fintech.tracker.n.dto;

import java.math.BigDecimal;

public record AssetsResponse(
        String name,
        BigDecimal value
){
}