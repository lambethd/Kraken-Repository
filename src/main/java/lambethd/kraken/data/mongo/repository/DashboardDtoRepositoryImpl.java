package lambethd.kraken.data.mongo.repository;

import domain.DashboardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

public class DashboardDtoRepositoryImpl implements DashboardDtoRepositoryCustom {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<DashboardDto> complerelyRangomName() {
        Query query = new Query();

        query.limit(1);
        query.with(new Sort(Sort.Direction.DESC, "created"));

        List<DashboardDto> dashboard = mongoTemplate.find(query, DashboardDto.class);
        if (dashboard.size() != 0) {
            return dashboard;
        } else {
            return null;
        }
    }
}
