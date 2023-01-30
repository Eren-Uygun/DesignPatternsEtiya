package chainOfResponsibility.caching;

public class RedisCache extends AbstractCache {
    @Override
    public void cache(String message) {
        System.out.println("Redis cache ile cache işlemi yapıldı.");
    }
}
