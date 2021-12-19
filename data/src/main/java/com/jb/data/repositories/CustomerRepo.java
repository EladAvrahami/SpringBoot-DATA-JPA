package com.jb.data.repositories;

import com.jb.data.beans.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository  //not must
public interface CustomerRepo extends JpaRepository<Customer,Integer> {
    //select * from customer where lastName=? AND firstName=?
    /*smart dialect*/
    List<Customer> findByLastNameAndFirstName(String lastName, String firstName);
}
