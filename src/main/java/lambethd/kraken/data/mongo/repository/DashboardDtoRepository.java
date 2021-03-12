package lambethd.kraken.data.mongo.repository;

import domain.DashboardDto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DashboardDtoRepository extends MongoRepository<DashboardDto, String>, DashboardDtoRepositoryCustom {
}
