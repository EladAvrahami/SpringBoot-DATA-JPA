package com.jb.data.CLR;

import com.jb.data.beans.Coupon;
import com.jb.data.beans.Customer;
import com.jb.data.repositories.CouponRepo;
import com.jb.data.repositories.CustomerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.sql.Array;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;

@Component
@Order(2)
@RequiredArgsConstructor
public class MyDBlists implements CommandLineRunner {
    private final CustomerRepo customerRepo;
    //private final CouponRepo couponRepo;

    @Override
    public void run(String... args) throws Exception {
        //Coupon coupon1 = new Coupon(0,"Ozzo", new Date(System.currentTimeMillis()));
        //Coupon coupon2 = new Coupon(0,"Suphlaki", new Date(System.currentTimeMillis()));
        //couponRepo.saveAll(Arrays.asList(coupon1,coupon2));

        //Customer customer = new Customer(0,"Rachel",new Date(System.currentTimeMillis()),true,32,145_000,null);

        Customer customer = Customer.builder()
                .firstName("Rachel")
                .lastName("lugassi")
                .isMarried(true)
                .salary(145_000)
                .age(32)
                .created(new Date(System.currentTimeMillis()))
                /*מימוש בכתיבה של singular annotation*/
                .coupon(new Coupon(0,"Ozzo", new Date(System.currentTimeMillis())))
                .coupon(new Coupon(0,"Suphlaki", new Date(System.currentTimeMillis())))
                .build();


        Customer customer2 = Customer.builder()
                .firstName("Aviv")
                .lastName("yom-tov")
                .isMarried(true)
                .salary(95_000)
                .age(28)
                .created(new Date(System.currentTimeMillis()))
                .coupon(new Coupon(0,"BMW", new Date(System.currentTimeMillis())))
                .coupon(new Coupon(0,"iMac", new Date(System.currentTimeMillis())))
                .build();

        customerRepo.saveAll(Arrays.asList(customer,customer2));


        //test the SD
        List<Customer> customers = customerRepo.findByLastNameAndFirstName("lugassi","Rachel");
        System.out.println("=====================================================================================================================");
        customers.forEach(System.out::println);
    }
}
