package lambethd.kraken.data.repository;

import domain.orchestration.Job;
import domain.orchestration.JobStatus;
import lambethd.kraken.data.repository.dto.JobDto;
import org.springframework.stereotype.Service;

@Service
public class JobRepository extends BaseRepository<JobDto, Job> {
    public Job findByJobStatus(JobStatus status){
        internalRepo.
    }
}
