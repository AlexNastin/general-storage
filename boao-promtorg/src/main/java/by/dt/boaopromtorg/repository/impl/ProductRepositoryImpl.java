package by.dt.boaopromtorg.repository.impl;

import by.dt.boaopromtorg.entity.Product;
import by.dt.boaopromtorg.entity.dto.ProductSearchDTO;
import by.dt.boaopromtorg.repository.ProductRepository;
import by.dt.boaopromtorg.repository.ProductRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
class ProductRepositoryImpl implements ProductRepositoryCustom{

    @Autowired
    MongoOperations mongoOperations;

    @Override public List<Product> findProducts(ProductSearchDTO productSearchDTO) {
        Query query = new Query();
        Criteria criteria = new Criteria();
        List<Criteria> criteriaList = new ArrayList<>();
        if(productSearchDTO.getName() != null){
            criteriaList.add(Criteria.where(ProductRepositoryCustom.NAME).regex(".*" + productSearchDTO.getName() + ".*"));
        }
        if(productSearchDTO.getCategory() != null){
            criteriaList.add(Criteria.where(ProductRepositoryCustom.CATEGORY).is(productSearchDTO.getCategory()));
        }
        if(productSearchDTO.getPriceFrom() != null){
            criteriaList.add(Criteria.where(ProductRepository.PRICE).gte(productSearchDTO.getPriceFrom()));
        }
        if(productSearchDTO.getPriceTo() != null){
            criteriaList.add(Criteria.where(ProductRepository.PRICE).lte(productSearchDTO.getPriceTo()));
        }

        if(!criteriaList.isEmpty()){
            criteria.andOperator(criteriaList.toArray(new Criteria[criteriaList.size()]));
        }
        query.addCriteria(criteria);

        return mongoOperations.find(query, Product.class);
    }
}
