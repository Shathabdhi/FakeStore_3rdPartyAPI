package com.API.designing.project.API.project.service;

import com.API.designing.project.API.project.DTO.FakestoreProductResponseDTO;
import com.API.designing.project.API.project.client.FakeStoreClient;
import com.API.designing.project.API.project.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FakeStoreProductServiceImpl implements ProductService{
    @Autowired
    private FakeStoreClient fakeStoreClient;
    @Override
    public List<FakestoreProductResponseDTO> getAllProducts() {
        List<FakestoreProductResponseDTO> fakestoreProducts = fakeStoreClient.getAllProducts();
        return fakestoreProducts;
    }

    @Override
    public Product getProduct(int productID) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Product updateProduct, int ProductId) {
        return null;
    }

    @Override
    public boolean deleteProduct(int productID) {
        return false;
    }
}
