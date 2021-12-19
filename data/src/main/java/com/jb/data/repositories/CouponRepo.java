package com.jb.data.repositories;

import com.jb.data.beans.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CouponRepo extends JpaRepository<Coupon, Integer> {
}
