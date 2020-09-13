package lambethd.kraken.data.mongo.repository;

import domain.orchestration.IJob;
import domain.orchestration.JobStatus;
import domain.orchestration.JobType;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface IJobRepository extends MongoRepository<IJob, String> {
    List<IJob> findJobByStatus(JobStatus status);

    IJob findById(String id);

    List<IJob> findByUsernameAndRuneDay(String username, int runeDay);

    Boolean existsByJobTypeAndStatusAndRuneDay(JobType jobType, JobStatus status, int runeDay);
}
