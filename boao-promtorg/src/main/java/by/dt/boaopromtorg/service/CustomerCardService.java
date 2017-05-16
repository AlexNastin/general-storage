package by.dt.boaopromtorg.service;

import by.dt.boaopromtorg.entity.CustomerCard;

public interface CustomerCardService {

    void addCustomerCard(CustomerCard customerCard);
    CustomerCard getCustomerCardByCardId(String cardId);
}
