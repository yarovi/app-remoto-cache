package org.inamsay.net.appcacheinfinity.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class inforCacheManager {
  @Autowired
  private CacheManager cacheManager;

  @Bean
  public ApplicationRunner logCacheProvider() {
    return args -> {
      System.out.println("➡️ Cache provider in use: " + cacheManager.getClass().getName());

      // También puedes listar los nombres de caches disponibles
      System.out.println("➡️ Available caches: " + cacheManager.getCacheNames());
    };
  }
}
