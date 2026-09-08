package com.example.mentaplataformas.model;

import java.math.BigDecimal;

public record BalanceMovimientosDTO(
        Long totalRecargasContador,
        BigDecimal totalRecargasMonto,
        Long totalRetirosContador,
        BigDecimal totalRetirosMonto
) {
}
