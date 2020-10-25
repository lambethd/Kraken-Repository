package lambethd.kraken.data.repository;

import lambethd.kraken.data.repository.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class BaseRepository<TInt, TExt> {
    @Autowired
    private CrudRepository<TInt, String> internalRepo;
    @Autowired
    private Mapper<TInt, TExt> mapper;

    public TExt save(TExt var1) {
        return mapper.mapToExternal(internalRepo.save(mapper.mapToInternal(var1)));
    }

    public Iterable<TExt> save(Iterable<TExt> var1) {
        return mapper.mapToExternal(internalRepo.save(mapper.mapToInternal(var1)));
    }

    public TExt findOne(String var1) {
        return mapper.mapToExternal(internalRepo.findOne(var1));
    }

    public boolean exists(String var1) {
        return internalRepo.exists(var1);
    }

    public Iterable<TExt> findAll() {
        return mapper.mapToExternal(internalRepo.findAll());
    }

    public Iterable<TExt> findAll(Iterable<String> var1) {
        return mapper.mapToExternal(internalRepo.findAll(var1));
    }

    public long count() {
        return internalRepo.count();
    }

    public void delete(String var1) {
        internalRepo.delete(var1);
    }

    public void delete(TExt var1) {
        internalRepo.delete(mapper.mapToInternal(var1));
    }

    public void delete(Iterable<TExt> var1) {
        internalRepo.delete(mapper.mapToInternal(var1));
    }

    public void deleteAll() {
        internalRepo.deleteAll();
    }
}
