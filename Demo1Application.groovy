package com.example.demo1

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Demo1Application {

    static void main(String[] args) {
        SpringApplication.run(Demo1Application, args)
        print("1111")
    }

}
