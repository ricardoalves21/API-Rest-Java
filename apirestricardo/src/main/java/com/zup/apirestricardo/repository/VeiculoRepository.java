package com.zup.apirestricardo.repository;

import com.zup.apirestricardo.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository <Veiculo, Long> {

    Veiculo findById(long codigo);

}
