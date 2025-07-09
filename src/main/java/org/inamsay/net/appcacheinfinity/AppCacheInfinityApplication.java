package org.inamsay.net.appcacheinfinity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AppCacheInfinityApplication {

  public static void main(String[] args) {
    SpringApplication.run(AppCacheInfinityApplication.class, args);
  }

}
