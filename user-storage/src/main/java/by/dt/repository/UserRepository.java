package by.dt.repository;

import by.dt.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends MongoRepository<User, String>{

    User findUserByLoginAndPassword(String login, String password);

    User findUserByLogin(String login);

}
