package chainOfResponsibility;

import chainOfResponsibility.caching.AbstractCache;
import chainOfResponsibility.caching.RedisCache;
import chainOfResponsibility.patterns.CacheChain;

public class Main {
    public static void main(String[] args) {

        AbstractCache abstractCache = CacheChain.getChainOfCache();
        abstractCache.cacheMessage("deneme");
    }
}
