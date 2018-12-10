package com.spring.ioc.bean;

import java.util.List;

import com.spring.ioc.accessor.CacheData;

public class CacheManager {

	private Cache cache;

	public CacheManager(Cache cache, List<CacheData> cacheData) {
		this.cache = cache;
		for (CacheData cData : cacheData) {
			this.cache.put(cData.getKey(), cData.getData());
		}
	}

}
