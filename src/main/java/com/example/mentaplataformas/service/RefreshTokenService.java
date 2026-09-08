package com.example.mentaplataformas.service;

import com.example.mentaplataformas.model.RefreshToken;
import com.example.mentaplataformas.repository.RefreshTokenRepository;
import com.example.mentaplataformas.util.TokenUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RefreshTokenService {

    private final RefreshTokenRepository refreshTokenRepository;

    public RefreshToken create(String userId, Duration ttl) {
        String token = UUID.randomUUID().toString() + "-" + TokenUtil.generateSecureToken(48); // 48 bytes ≈ 64 chars

        RefreshToken r = new RefreshToken();
        r.setToken(token);
        r.setUserId(userId);
        r.setExpiresAt(Instant.now().plus(ttl).toEpochMilli());
        r.setCreatedAt(Instant.now());

        return refreshTokenRepository.save(r);
    }

    public void invalidate(String token) {
        refreshTokenRepository.deleteByToken(token);
    }

    public Optional<RefreshToken> find(String token) {
        return refreshTokenRepository.findByToken(token);
    }


}
