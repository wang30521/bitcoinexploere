package com.wp.bitcoinexploere;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.wp.bitcoinexploere.dao")
@EnableFeignClients
@EnableScheduling
public class BitcoinexploereApplication {

    public static void main(String[] args) {
        SpringApplication.run(BitcoinexploereApplication.class, args);
    }

}
