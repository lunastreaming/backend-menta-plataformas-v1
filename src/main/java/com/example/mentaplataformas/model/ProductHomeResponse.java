package com.example.mentaplataformas.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductHomeResponse {
    private ProductDto product;
    private long availableStockCount;
}
