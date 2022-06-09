package com.bridgelabz.addressbook;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class AddressbookBackendApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to Addressbook");
        SpringApplication.run(AddressbookBackendApplication.class, args);
        log.info("Addressbook App Started");
    }

}
