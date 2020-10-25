package lambethd.kraken.data.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import portfolio.Spread;

import java.util.List;

public interface ISpreadRepository extends MongoRepository<Spread, String> {
    List<Spread> getSpreadByUsername(String username, Sort sort);
}
