package lambethd.kraken.data.repository;

import dto.Configuration;
import lambethd.kraken.data.repository.dto.ConfigDto;
import org.springframework.stereotype.Service;

@Service
public class ConfigRepository extends BaseRepository<ConfigDto, Configuration> {
}
