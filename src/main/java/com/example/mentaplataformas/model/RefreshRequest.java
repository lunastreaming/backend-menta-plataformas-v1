package com.example.mentaplataformas.model;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RefreshRequest {

    private String refreshToken;

}
