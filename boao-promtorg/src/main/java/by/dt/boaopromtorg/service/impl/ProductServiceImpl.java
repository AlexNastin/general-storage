package by.dt.boaopromtorg.service.impl;

import by.dt.boaopromtorg.entity.Product;
import by.dt.boaopromtorg.entity.dto.ProductSearchDTO;
import by.dt.boaopromtorg.repository.ProductRepository;
import by.dt.boaopromtorg.service.ProductService;
import by.dt.boaopromtorg.web.controller.exception.ProductAlreadyExistException;
import by.dt.boaopromtorg.web.controller.exception.ProductNotFoundException;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;


    public void addProduct(Product product) {
        Product existingPorduct = productRepository.findProductByBarcode(product.getBarcode());
        if(existingPorduct != null){
            throw new ProductAlreadyExistException("Product is already exist");
        }
        ObjectId objectId = new ObjectId();
        product.setId(objectId.toString());
        productRepository.insert(product);
    }

    @Override public List<Product> searchProduct(ProductSearchDTO productSearchDTO) {
        List<Product> products = productRepository.findProductsByCriteria(productSearchDTO);
        if(products == null || products.isEmpty()){
            throw new ProductNotFoundException("Product not found");
        }
        return products;
    }

    @Override public Product searchProductByBarCode(String barcode) {
        Product product = productRepository.findProductByBarcode(barcode);
        if(product == null){
            throw new ProductNotFoundException("Product not found");
        }
        return product;
    }
}
