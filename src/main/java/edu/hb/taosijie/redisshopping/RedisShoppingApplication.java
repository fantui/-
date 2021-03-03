package edu.hb.taosijie.redisshopping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("edu.hb.taosijie.redisshopping.pojo")
public class RedisShoppingApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisShoppingApplication.class, args);
    }

}
