package lambethd.kraken.data.mongo.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import runescape.Item;

import java.util.List;

public interface IItemRepository extends MongoRepository<Item, String> {
    List<Item> getItemsByName(String name, Sort sort);
    Item getItemById(Integer id);
    List<Item> findByNameRegex(String regex, Sort sort);
    List<Item> findAll(Sort sort);
}
