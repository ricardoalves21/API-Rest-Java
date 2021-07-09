package com.apirest.pratica.repository;

import com.apirest.pratica.models.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.Optional;

public interface ContaRepository extends JpaRepository<Conta, Long> {

    Optional<Conta> findById(long id);

    Optional<BigDecimal> findSaldoById(long id);
}