package by.dt.boaopromtorg.service.impl;

import by.dt.boaopromtorg.entity.CustomerCard;
import by.dt.boaopromtorg.repository.CustomerCardRepository;
import by.dt.boaopromtorg.service.CustomerCardService;
import by.dt.boaopromtorg.web.controller.exception.CustomerCardAlreadyExistException;
import by.dt.boaopromtorg.web.controller.exception.CustomerCardNotFoundException;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerCardServiceImpl implements CustomerCardService{

    @Autowired
    private CustomerCardRepository customerCardRepository;

    @Override public void addCustomerCard(CustomerCard customerCard) {
        CustomerCard existingCustomerCard = customerCardRepository.findCustomerCurdByCardId(customerCard.getCardId());
        if(existingCustomerCard != null){
            throw new CustomerCardAlreadyExistException("Customer card with current card id is already exist");
        }
        ObjectId objectId = new ObjectId();
        customerCard.setId(objectId.toString());
        customerCardRepository.insert(customerCard);
    }

    @Override public CustomerCard getCustomerCardByCardId(Long cardId) {
        CustomerCard customerCard = customerCardRepository.findCustomerCurdByCardId(cardId);
        if(customerCard == null){
            throw new CustomerCardNotFoundException("Customer card with current card id not found");
        }
        return customerCard;
    }
}
