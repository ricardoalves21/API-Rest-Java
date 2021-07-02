package com.ricardo.devsuperior.repository;

import com.ricardo.devsuperior.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository <Category, Long> {

}
