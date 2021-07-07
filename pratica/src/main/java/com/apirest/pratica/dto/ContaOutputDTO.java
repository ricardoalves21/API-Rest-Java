package com.apirest.pratica.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ContaOutputDTO {

    private long id;
    private String titular;
    private BigDecimal saldo;
}
