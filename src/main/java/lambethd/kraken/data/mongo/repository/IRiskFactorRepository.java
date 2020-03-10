package lambethd.kraken.data.mongo.repository;

import dto.RiskFactorDto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IRiskFactorRepository extends MongoRepository<RiskFactorDto, String> {
}
