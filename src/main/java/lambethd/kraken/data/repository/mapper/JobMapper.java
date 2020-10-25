package lambethd.kraken.data.repository.mapper;

import domain.orchestration.Job;
import lambethd.kraken.data.repository.dto.JobDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JobMapper implements Mapper<JobDto, Job> {
    @Override
    public Job mapToExternal(JobDto internal) {
        ModelMapper modelMapper = new ModelMapper();
        Job external = modelMapper.map(internal, Job.class);
        return external;
    }

    @Override
    public JobDto mapToInternal(Job external) {
        ModelMapper modelMapper = new ModelMapper();
        JobDto internal = modelMapper.map(external, JobDto.class);
        return internal;
    }

    @Override
    public Iterable<Job> mapToExternal(Iterable<JobDto> internals) {
        ArrayList<Job> externals = new ArrayList<>();
        internals.forEach(i -> externals.add(mapToExternal(i)));
        return externals;
    }

    @Override
    public Iterable<JobDto> mapToInternal(Iterable<Job> externals) {
        ArrayList<JobDto> internals = new ArrayList<>();
        externals.forEach(i -> internals.add(mapToInternal(i)));
        return internals;
    }
}
