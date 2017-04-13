package by.dt.boaopromtorg.service;

import by.dt.boaopromtorg.entity.Shop;

public interface ShopService {
    void addShop(Shop shop);
    Shop getShopByAddress(String address);
}
