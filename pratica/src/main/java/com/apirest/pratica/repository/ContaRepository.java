package com.apirest.pratica.repository;

import com.apirest.pratica.models.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, Long> {

    Conta findById(long id);

}
