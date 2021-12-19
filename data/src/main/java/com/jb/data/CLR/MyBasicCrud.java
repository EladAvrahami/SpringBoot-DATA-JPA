package com.jb.data.CLR;

import com.jb.data.beans.Customer;
import com.jb.data.repositories.CustomerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.Arrays;

//@Component
@RequiredArgsConstructor
@Order(1)
public class MyBasicCrud implements CommandLineRunner {
    private final CustomerRepo customerRepo;

    @Override
    public void run(String... args) throws Exception {
        /*
        Customer customer1 = Customer.builder()
                .age(47)
                .created(new Date(System.currentTimeMillis()))
                .salary(45_000)
                .name("Zeev")
                .isMarried(true)
                .build();

        System.out.println(customer1);
        customerRepo.save(customer1);


        Customer customer1 = customerRepo.findAll().get(0);  //get one (the first one)
        System.out.println(customer1);


        customerRepo.deleteById(1); //delete customer by id = 1



        Customer customer1 = customerRepo.findAll().get(0);  //get one (the first one)
        customer1.setSalary(90_000);  //update the salary
        customerRepo.saveAndFlush(customer1); //save and flush the data (flush, do it now!!!)

        */


        //save like a boss (Kobi Shasha)
        /*
        Customer customer1 = Customer.builder()
                .age(47)
                .created(new Date(System.currentTimeMillis()))
                .salary(45_000)
                .name("Zeev")
                .isMarried(true)
                .build();
        Customer customer2 = Customer.builder()
                .age(28)
                .created(new Date(System.currentTimeMillis()))
                .salary(55_000)
                .name("Aviv")
                .isMarried(true)
                .build();
        Customer customer3 = Customer.builder()
                .age(28)
                .created(new Date(System.currentTimeMillis()))
                .salary(95_000)
                .name("Bar")
                .isMarried(true)
                .build();

        customerRepo.saveAll(Arrays.asList(customer1,customer2,customer3));
        */

    }
}
