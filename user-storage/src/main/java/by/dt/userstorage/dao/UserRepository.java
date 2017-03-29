package by.dt.userstorage.dao;

import by.dt.userstorage.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends MongoRepository<User, Long>{

    User findUserByLoginAndPassword(String login, String password);

}
