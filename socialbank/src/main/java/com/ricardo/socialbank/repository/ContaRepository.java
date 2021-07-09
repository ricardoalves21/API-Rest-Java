package com.ricardo.socialbank.repository;

import com.ricardo.socialbank.models.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository <Conta, Long> {

    Conta findById(long id);

}
