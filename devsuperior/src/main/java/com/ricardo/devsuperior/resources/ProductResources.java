package com.ricardo.devsuperior.resources;

import com.ricardo.devsuperior.entities.Product;
import com.ricardo.devsuperior.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResources {

    @Autowired
    private ProductRepository categoryRepository;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = categoryRepository.findAll();
            return ResponseEntity.ok().body(list);
        }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product>findById(@PathVariable Long id) {
        Product cat = categoryRepository.findById(id).get();
        return ResponseEntity.ok().body(cat);
    }
}
