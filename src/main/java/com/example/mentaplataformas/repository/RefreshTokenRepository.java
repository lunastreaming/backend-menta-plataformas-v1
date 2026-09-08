package com.example.mentaplataformas.repository;

import com.example.mentaplataformas.model.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {

    Optional<RefreshToken> findByToken(String token);
    void deleteByToken(String token);
    void deleteByExpiresAtLessThan(Long epochMillis);

}
