package by.dt.boaopromtorg.web.controller;

import by.dt.boaopromtorg.entity.CustomerCard;
import by.dt.boaopromtorg.service.CustomerCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/customerCard")
public class CustomerCardController {

    @Autowired
    private CustomerCardService customerCardService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity addCustomerCards(@RequestBody CustomerCard customerCard){
        customerCardService.addCustomerCard(customerCard);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(path = "/{cardId}", method = RequestMethod.GET)
    public CustomerCard getCustomerCardByCardId(@PathVariable Long cardId){
        return customerCardService.getCustomerCardByCardId(cardId);
    }
}
