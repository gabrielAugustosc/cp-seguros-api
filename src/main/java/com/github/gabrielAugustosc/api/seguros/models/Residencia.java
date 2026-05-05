package com.github.gabrielAugustosc.api.seguros.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="residencias")
public class Residencia {
    @Id
    private Long id;

    @Column(name="logradouro_residencia", nullable=false)
    private String logradouro;

    @Column(name="endereco_residencia", nullable=true)
    private String endereco;

    @Column(name="numero_residencia", nullable=true)
    private Integer numero;

    @Column(name="complemento_residencia", nullable=true)
    private String complemento;
}