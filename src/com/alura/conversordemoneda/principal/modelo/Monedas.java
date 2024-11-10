package com.alura.conversordemoneda.principal.modelo;

public record Monedas(
        String base_code,
        String target_code,
        String conversion_rate
) {
}
