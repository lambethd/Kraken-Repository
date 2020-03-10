package lambethd.kraken.data.mongo.repository;

import dto.StockMarketDataDto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IStockMarketDataRepository extends MongoRepository<StockMarketDataDto, String> {
}
