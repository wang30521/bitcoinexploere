package com.wp.bitcoinexploere;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.wp.bitcoinexploere.dao")
@EnableFeignClients
public class BitcoinexploereApplication {

    public static void main(String[] args) {
        SpringApplication.run(BitcoinexploereApplication.class, args);
    }

}
