package lambethd.kraken.data.repository;

import domain.orchestration.JobDetail;
import org.socialsignin.spring.data.dynamodb.repository.DynamoDBCrudRepository;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface IJobDetailRepository extends DynamoDBCrudRepository<JobDetail, String> {
}
