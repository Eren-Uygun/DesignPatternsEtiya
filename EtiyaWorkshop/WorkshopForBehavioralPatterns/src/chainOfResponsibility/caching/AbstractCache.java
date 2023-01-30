package chainOfResponsibility.caching;

public abstract class AbstractCache {

    public AbstractCache nextCache;

    public void cacheMessage(String message){
       cache(message);
       if (message != null){
           nextCache.cacheMessage(message);
       }
    }

    public abstract void cache(String message);
}
