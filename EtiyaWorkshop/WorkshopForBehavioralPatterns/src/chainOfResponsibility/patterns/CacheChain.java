package chainOfResponsibility.patterns;

import chainOfResponsibility.caching.AbstractCache;
import chainOfResponsibility.caching.AlternativeCaching;
import chainOfResponsibility.caching.RedisCache;

public class CacheChain {


    public static AbstractCache getChainOfCache(){
        AbstractCache redisCache = new RedisCache();
        AbstractCache alternativeCache = new AlternativeCaching();

        redisCache.nextCache = alternativeCache;

        return redisCache;
    }



}
