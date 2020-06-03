package com.lucky.shop.common.tool;

import java.util.HashMap;

/**
 * map工具类
 *
 * @Author Guo Huaijian
 * @Date 2020/5/17 19:58
 */
public final class Maps {

    private Maps() {
    }

    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<K, V>(100);
    }

    public static <K, V> HashMap<K, V> newHashMap(K k, V v) {
        HashMap<K, V> map = new HashMap<K, V>(100);
        map.put(k, v);
        return map;
    }

    @SuppressWarnings("unchecked")
    public static <K, V> HashMap<K, V> newHashMap(K k, V v,
                                                  Object... extraKeyValues) {
        if (extraKeyValues.length % 2 != 0) {
            throw new IllegalArgumentException();
        }
        HashMap<K, V> map = new HashMap<K, V>(100);
        map.put(k, v);
        for (int i = 0; i < extraKeyValues.length; i += 2) {
            k = (K) extraKeyValues[i];
            v = (V) extraKeyValues[i + 1];
            map.put(k, v);
        }
        return map;
    }
}
