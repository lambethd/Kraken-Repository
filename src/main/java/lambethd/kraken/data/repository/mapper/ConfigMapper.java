package lambethd.kraken.data.repository.mapper;

import dto.Configuration;
import lambethd.kraken.data.repository.dto.ConfigDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ConfigMapper implements Mapper<ConfigDto, Configuration> {
    @Override
    public Configuration mapToExternal(ConfigDto internal) {
        ModelMapper modelMapper = new ModelMapper();
        Configuration external = modelMapper.map(internal, Configuration.class);
        return external;
    }

    @Override
    public ConfigDto mapToInternal(Configuration external) {
        ModelMapper modelMapper = new ModelMapper();
        ConfigDto internal = modelMapper.map(external, ConfigDto.class);
        return internal;
    }

    @Override
    public Iterable<Configuration> mapToExternal(Iterable<ConfigDto> internals) {
        ArrayList<Configuration> externals = new ArrayList<>();
        internals.forEach(i -> externals.add(mapToExternal(i)));
        return externals;
    }

    @Override
    public Iterable<ConfigDto> mapToInternal(Iterable<Configuration> externals) {
        ArrayList<ConfigDto> internals = new ArrayList<>();
        externals.forEach(i -> internals.add(mapToInternal(i)));
        return internals;
    }
}
