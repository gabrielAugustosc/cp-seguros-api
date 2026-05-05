package com.github.gabrielAugustosc.api.seguros.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="autos")
public class Auto {
    @Id
    private Long id;

    @Column(name="nome_auto", nullable=true)
    private String nome;

    @Column(name="modelo_auto", nullable=true)
    private String modelo;

    @Column(name="ano_auto", nullable=true)
    private Integer ano;

    @Column(name="chassi_auto", nullable=false)
    private String chassi;
}
