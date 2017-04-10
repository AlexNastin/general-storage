package by.dt.boaopromtorg.repository;

import by.dt.boaopromtorg.entity.CustomerCard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerCardRepository extends MongoRepository<CustomerCard,String>{

    CustomerCard findCustomerCurdByCardId(Long cardId);
}
