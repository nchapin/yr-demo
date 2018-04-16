package com.example.yrdemo.commands;

import org.ehcache.Cache;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.Callable;

public abstract class AbstractCommand implements Callable<CommandReturn> {
    @Autowired
    APICacheProvider apiCacheProvider;

    public String getCacheKey() {
        return null;
    }

    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public CommandReturn call() throws Exception {
        String key = getCacheKey();
        if (key != null) {
            Cache<String, CommandReturn> cache = apiCacheProvider.getAPICache();
            CommandReturn cachedValue = cache.get(key);
            if (cachedValue != null) {
                return cachedValue;
            } else {
                CommandReturn realValue = doInternalCall();
                cache.put(key, realValue);
                return realValue;
            }
        }
        return doInternalCall();
    }

    protected abstract CommandReturn doInternalCall() throws Exception;
}
