package lambethd.kraken.data.repository.internal;

import lambethd.kraken.data.repository.dto.JobDto;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface InternalUserSettingsRepository extends CrudRepository<JobDto, String> {

}
