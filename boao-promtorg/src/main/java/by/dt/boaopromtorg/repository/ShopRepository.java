package by.dt.boaopromtorg.repository;

import by.dt.boaopromtorg.entity.Shop;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends MongoRepository<Shop,String>{
    Shop findShopByAddress(String address);
}
