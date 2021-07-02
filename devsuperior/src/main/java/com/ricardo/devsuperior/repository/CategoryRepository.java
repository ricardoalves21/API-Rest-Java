package com.ricardo.devsuperior.repository;

import com.ricardo.devsuperior.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository <Category, Long> {

    List<Object> findById(Long id);
}
