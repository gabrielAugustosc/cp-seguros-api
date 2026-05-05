package com.github.gabrielAugustosc.api.seguros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.gabrielAugustosc.api.seguros.models.Auto;

public interface AutoRepository extends JpaRepository<Auto, Long>{
    
}