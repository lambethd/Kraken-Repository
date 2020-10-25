package lambethd.kraken.data.repository.mapper;

public interface Mapper<TInt, TExt> {
    TExt mapToExternal(TInt internal);

    TInt mapToInternal(TExt external);

    Iterable<TExt> mapToExternal(Iterable<TInt> internals);
    
    Iterable<TInt> mapToInternal(Iterable<TExt> externals);
}
