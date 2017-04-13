package by.dt.boaopromtorg.service.impl;

import by.dt.boaopromtorg.entity.Price;
import by.dt.boaopromtorg.entity.Product;
import by.dt.boaopromtorg.entity.dto.PriceDTO;
import by.dt.boaopromtorg.entity.dto.ProductSearchDTO;
import by.dt.boaopromtorg.repository.ProductRepository;
import by.dt.boaopromtorg.service.ProductService;
import by.dt.boaopromtorg.web.controller.exception.AlreadyExistException;
import by.dt.boaopromtorg.web.controller.exception.NotFoundException;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;


    public void addProduct(Product product) {
        Product existingProduct = productRepository.findProductByBarcode(product.getBarcode());
        if(existingProduct != null){
            throw new AlreadyExistException("Product is already exist");
        }
        ObjectId objectId = new ObjectId();
        product.setId(objectId.toString());
        productRepository.insert(product);
    }

    @Override public List<Product> searchProduct(ProductSearchDTO productSearchDTO) {
        List<Product> products = productRepository.findProducts(productSearchDTO);
        if(products == null || products.isEmpty()){
            throw new NotFoundException("Product not found");
        }
        return products;
    }

    @Override public Product searchProductByBarсode(String barcode) {
        Product product = productRepository.findProductByBarcode(barcode);
        if(product == null){
            throw new NotFoundException("Product not found");
        }
        return product;
    }

    @Override public void updatePrice(PriceDTO priceDTO) {
        Product product = productRepository.findProductByBarcode(priceDTO.getBarcode());
        boolean hasPriceWithCurrentPriceUnit = false;
        for (Price price : product.getPrices()){
            price.getShopIds().removeAll(priceDTO.getShopIds());
            if(price.getPriceUnit().equals(priceDTO.getPriceUnit())){
                hasPriceWithCurrentPriceUnit = true;
                price.getShopIds().addAll(priceDTO.getShopIds());
            }
            if(price.getShopIds().isEmpty()){
                product.getPrices().remove(price);
            }
        }
        if(!hasPriceWithCurrentPriceUnit){
            Price price = new Price(priceDTO);
            product.getPrices().add(price);
        }
        productRepository.save(product);
    }
}
