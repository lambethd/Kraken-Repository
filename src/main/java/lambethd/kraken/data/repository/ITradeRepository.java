package lambethd.kraken.data.repository;

import org.bson.types.ObjectId;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import portfolio.HistoricalTrade;

import java.util.List;

public interface ITradeRepository extends MongoRepository<HistoricalTrade, String> {
    HistoricalTrade findTradeById(ObjectId tradeId);

    List<HistoricalTrade> findTradeByUsername(String username, Sort sort);
}
