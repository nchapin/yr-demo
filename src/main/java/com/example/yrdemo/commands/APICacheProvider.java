package com.example.yrdemo.commands;


import org.ehcache.Cache;
import org.ehcache.CacheManager;
import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.CacheManagerBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;
import org.springframework.stereotype.Component;



@Component
public class APICacheProvider {
    CacheManager cacheManager;
    Cache<String, CommandReturn> apiCache;

    public APICacheProvider() {
        super();
        this.cacheManager = CacheManagerBuilder.newCacheManagerBuilder()
                .withCache("preConfigured",
                        CacheConfigurationBuilder.newCacheConfigurationBuilder(String.class, CommandReturn.class,
                                ResourcePoolsBuilder.heap(100))
                                .build())
                .build(true);
         apiCache = cacheManager.getCache("preConfigured", String.class, CommandReturn.class);
    }

    public Cache<String, CommandReturn> getAPICache() {
        return apiCache;
    }
}
