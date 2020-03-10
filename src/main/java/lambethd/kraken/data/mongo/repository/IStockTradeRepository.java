package lambethd.kraken.data.mongo.repository;

import dto.StockTradeDto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IStockTradeRepository extends MongoRepository<StockTradeDto, String> {
}
