package lambethd.kraken.data.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import portfolio.Position;

import java.util.List;

public interface IPositionRepository extends MongoRepository<Position, String> {
    Position getPositionByItemIdAndUsername(Integer itemId, String username);

    List<Position> getPositionsByUsername(String username);
}
