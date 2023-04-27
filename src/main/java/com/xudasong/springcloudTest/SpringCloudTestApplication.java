package com.xudasong.springcloudTest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xudasong.springcloudTest.mapper")
public class SpringCloudTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTestApplication.class, args);
	}

}
