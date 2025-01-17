package org.itstack.naive.chat.client.infrastructure.util;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * hznu
 * @auther lxj
 *  
 */
public class BeanUtil {

    private static Map<String, Object> cacheMap = new ConcurrentHashMap<>();

    public static synchronized void addBean(String name, Object obj) {
        cacheMap.put(name, obj);
    }

    public static <T> T getBean(String name, Class<T> t) {
        return (T) cacheMap.get(name);
    }

}
