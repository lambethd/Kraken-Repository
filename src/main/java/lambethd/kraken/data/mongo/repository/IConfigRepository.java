package lambethd.kraken.data.mongo.repository;

import dto.ConfigurationDto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IConfigRepository extends MongoRepository<ConfigurationDto, String> {
}
