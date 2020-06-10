package lambethd.kraken.data.mongo.repository;

import domain.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface IUserRepository extends MongoRepository<User, String> {
    User getUserById(String id);

    User getUserByUsername(String username);

    List<User> findAll(Sort sort);

    List<User> findAll();
}
