package by.dt.boaopromtorg.web.controller;

import by.dt.boaopromtorg.entity.Shop;
import by.dt.boaopromtorg.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity addShops(@RequestBody Shop shop) {
        shopService.addShop(shop);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Shop getShopByAddress(@RequestParam String address){
        return shopService.getShopByAddress(address);
    }
}
