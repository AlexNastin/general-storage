package by.dt.boaopromtorg.repository;

import by.dt.boaopromtorg.entity.Product;
import by.dt.boaopromtorg.entity.dto.ProductSearchDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepositoryCustom {

    String NAME = "name";
    String CATEGORY = "category";
    String SUB_CATEGORY = "subCategory";
    String PRICE = "prices.priceUnit";

    List<Product> findProducts(ProductSearchDTO productSearchDTO);


}
