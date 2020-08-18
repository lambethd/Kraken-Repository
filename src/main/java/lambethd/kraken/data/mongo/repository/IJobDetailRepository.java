package lambethd.kraken.data.mongo.repository;

import domain.orchestration.JobDetail;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IJobDetailRepository extends MongoRepository<JobDetail, String> {
}
