package com.apirest.pratica.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@Setter
public class ContaInputDTO {

    @NotBlank
    private String titular;

    @NotNull
    private BigDecimal saldo;
}
