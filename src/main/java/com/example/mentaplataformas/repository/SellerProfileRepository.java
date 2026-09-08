package com.example.mentaplataformas.repository;

import com.example.mentaplataformas.model.SellerProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SellerProfileRepository extends JpaRepository<SellerProfileEntity, UUID> {
}
