package com.API.designing.project.API.project.controller;

import com.API.designing.project.API.project.DTO.FakestoreProductResponseDTO;
import com.API.designing.project.API.project.entity.Product;
import com.API.designing.project.API.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private ProductService productService;//field injection
    @Autowired
    public ProductController (ProductService productService){//constructor injection
        this.productService = productService;
    }
    @GetMapping("/product")
    public ResponseEntity getAllProducts(){
        List<FakestoreProductResponseDTO> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }
}
