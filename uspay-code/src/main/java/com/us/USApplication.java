package cn.US;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author USx
 */
@SpringBootApplication
//启用缓存
@EnableCaching
//启用异步
@EnableAsync
//定时任务
@EnableScheduling
public class USpayApplication {

    public static void main(String[] args) {
        SpringApplication.run(USpayApplication.class, args);
    }
}
