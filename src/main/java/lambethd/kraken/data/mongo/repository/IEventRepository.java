package lambethd.kraken.data.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import runescape.Event;

import java.time.LocalDateTime;
import java.util.List;

public interface IEventRepository extends MongoRepository<Event, String> {
    List<Event> getEventByDateGreaterThan(LocalDateTime startDate);
}
