package nullObject.caches;

public class RedisCacheService implements ICache{
    @Override
    public void cache() {
        System.out.println("Redis Cache ile cache işlemi yapıldı.");
    }
}
