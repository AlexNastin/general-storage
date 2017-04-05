package by.dt.boaopromtorg.service;

import by.dt.boaopromtorg.entity.Product;
import by.dt.boaopromtorg.entity.dto.ProductSearchDTO;

import java.util.List;

public interface ProductService {

    void addProduct(Product product);
    List<Product> searchProduct(ProductSearchDTO productSearchDTO);
    Product searchProductByBarсode(String barcode);

}
