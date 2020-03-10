package lambethd.kraken.data.mongo.repository;

import dto.TradeDto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ITradeRepository extends MongoRepository<TradeDto, String> {
}
