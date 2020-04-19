package lambethd.kraken.data.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import runescape.Item;

import java.util.List;

public interface IItemRepository extends MongoRepository<Item, String> {
    Item getItemByName(String name);
    Item getItemById(Integer id);
    List<Item> findByNameRegex(String regex);
}
