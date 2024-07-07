package com.API.designing.project.API.project.service;

import com.API.designing.project.API.project.DTO.FakestoreProductResponseDTO;
import com.API.designing.project.API.project.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;
public interface ProductService {
    List<FakestoreProductResponseDTO> getAllProducts();
    Product getProduct(int productID);
    Product createProduct(Product product);
    Product updateProduct(Product updateProduct,int ProductId);
    boolean deleteProduct(int productID);
}
