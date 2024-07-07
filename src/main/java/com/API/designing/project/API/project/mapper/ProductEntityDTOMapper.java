package com.API.designing.project.API.project.mapper;

import com.API.designing.project.API.project.DTO.ProductResponseDTO;
import com.API.designing.project.API.project.entity.Product;

public class ProductEntityDTOMapper {
    public static ProductResponseDTO convertEntityToProductResponseDTO(Product product){
        ProductResponseDTO responseDTO = new ProductResponseDTO();
        responseDTO.setProductId(product.getId());
        responseDTO.setCategory(product.getCategory());
        responseDTO.setPrice(product.getPrice());
        responseDTO.setDescription(product.getDescription());
        responseDTO.setImageURL(product.getImageURL());
        responseDTO.setTitle(product.getTitle());
        responseDTO.setRating(product.getRating());
        return responseDTO;

    }
}
