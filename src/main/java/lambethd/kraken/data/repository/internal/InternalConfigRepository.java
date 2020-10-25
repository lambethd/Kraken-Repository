package lambethd.kraken.data.repository.internal;

import lambethd.kraken.data.repository.dto.ConfigDto;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface InternalConfigRepository extends CrudRepository<ConfigDto, String>{

}
