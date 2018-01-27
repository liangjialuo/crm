package com.zking.crm.base.util;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

import java.io.InputStream;

public class EhcacheUtil {

    private static CacheManager cacheManager;

    static {
        try {
            InputStream is = EhcacheUtil.class.getResourceAsStream("/ehcache.xml");
            cacheManager = CacheManager.create(is);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private EhcacheUtil() {
    }

    public static void put(String cacheName, Object key, Object value) {
        Cache cache = cacheManager.getCache(cacheName);
        if (null == cache) {
            //以默认配置添加一个名叫cacheName的Cache
            cacheManager.addCache(cacheName);
            cache = cacheManager.getCache(cacheName);
        }
        cache.put(new Element(key, value));
    }


    public static Object get(String cacheName, Object key) {
        Cache cache = cacheManager.getCache(cacheName);
        Element element = cache.get(key);
        return null == element ? null : element.getValue();
    }

    public static void remove(String cacheName, Object key) {
        Cache cache = cacheManager.getCache(cacheName);
        cache.remove(key);
    }
}
