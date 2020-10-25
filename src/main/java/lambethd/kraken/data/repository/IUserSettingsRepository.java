package lambethd.kraken.data.repository;

import domain.UserSettings;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IUserSettingsRepository extends MongoRepository<UserSettings, String> {
    UserSettings getUserSettingsByUsername(String username);
}
