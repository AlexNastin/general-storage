package by.dt.boaopromtorg.web.controller;

import by.dt.boaopromtorg.entity.Product;
import by.dt.boaopromtorg.entity.dto.PriceDTO;
import by.dt.boaopromtorg.entity.dto.ProductSearchDTO;
import by.dt.boaopromtorg.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity addProducts(@RequestBody List<Product> products) {
        products.forEach((product) -> productService.addProduct(product));
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Product> searchProducts(@RequestParam String name, @RequestParam String category,
                                        @RequestParam String subCategory, @RequestParam Double priceFrom,
                                        @RequestParam Double priceTo) {
        ProductSearchDTO productSearchDTO = new ProductSearchDTO(name, category, subCategory, priceFrom, priceTo);
        return productService.searchProduct(productSearchDTO);
    }

    @RequestMapping(path = "/{barcode}", method = RequestMethod.GET)
    public Product searchProductByBarcode(@PathVariable String barcode) {
        return productService.searchProductByBarсode(barcode);
    }

    @RequestMapping(path = "/price", method = RequestMethod.PUT)
    public ResponseEntity updatePrices(@RequestBody List<PriceDTO> productDTOs) {
        productDTOs.forEach((productDTO) -> productService.updatePrice(productDTO));
        return new ResponseEntity(HttpStatus.OK);
    }
}
