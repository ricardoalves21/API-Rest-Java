package com.apirest.pratica.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "tbl_conta")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Conta implements Serializable {

    private static final long serialVersionUID = 1L;

    @EqualsAndHashCode.Include
    @Id
    @Column(name = "id_conta")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "titular", nullable = false)
    private String titular;

    @Column(name = "saldo", nullable = false)
    private BigDecimal saldo;
}
