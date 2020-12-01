package lambethd.kraken.data.mongo.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import portfolio.Trade;

import java.util.List;

public interface ICurrentTradeRepository extends MongoRepository<Trade, String> {
    Trade findTradeById(String tradeId);
    List<Trade> findTradeByUsername(String username, Sort sort);
}
