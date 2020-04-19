package lambethd.kraken.data.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import runescape.Graph;

public interface IGraphRepository extends MongoRepository<Graph, String> {
    Graph getGraphByItemId(Integer id);
}
