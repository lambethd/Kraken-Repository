package lambethd.kraken.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import runescape.Graph;

import java.util.List;

public interface IGraphRepository extends MongoRepository<Graph, String> {
    Graph getGraphById(Integer id);
}
