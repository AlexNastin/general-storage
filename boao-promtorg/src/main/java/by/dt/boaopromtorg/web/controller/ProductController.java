package by.dt.boaopromtorg.web.controller;

import by.dt.boaopromtorg.entity.Product;
import by.dt.boaopromtorg.entity.dto.ProductSearchDTO;
import by.dt.boaopromtorg.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(path = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity addProducts(@RequestBody Set<Product> products){
        products.forEach((product) -> productService.addProduct(product));
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(path = "/search", method = RequestMethod.POST)
    public List<Product> searchProducts(@RequestBody ProductSearchDTO productSearchDTO){
        return productService.searchProduct(productSearchDTO);
    }

    @RequestMapping(path = "/search/{barcode}", method = RequestMethod.GET)
    public Product searchProductByBarcode(@PathVariable String barcode){
        return productService.searchProductByBarсode(barcode);
    }
}
