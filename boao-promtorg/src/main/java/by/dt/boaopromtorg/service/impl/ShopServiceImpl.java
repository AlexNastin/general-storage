package by.dt.boaopromtorg.service.impl;

import by.dt.boaopromtorg.entity.Shop;
import by.dt.boaopromtorg.repository.ShopRepository;
import by.dt.boaopromtorg.service.ShopService;
import by.dt.boaopromtorg.web.controller.exception.AlreadyExistException;
import by.dt.boaopromtorg.web.controller.exception.NotFoundException;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopServiceImpl implements ShopService{

    @Autowired
    private ShopRepository shopRepository;

    @Override public void addShop(Shop shop) {
        Shop existingShop = shopRepository.findShopByAddress(shop.getAddress());
        if(existingShop != null){
            throw new AlreadyExistException("Shop with address:" + shop.getAddress() + " is already exist");
        }
        ObjectId objectId = new ObjectId();
        shop.setId(objectId.toString());
        shopRepository.insert(shop);
    }

    @Override public Shop getShopByAddress(String address) {
        Shop shop = shopRepository.findShopByAddress(address);
        if(shop == null){
            throw new NotFoundException("Shop with address:" + shop.getAddress() + " not found");
        }
        return shop;
    }
}
