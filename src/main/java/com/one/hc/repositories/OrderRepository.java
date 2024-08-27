package com.one.hc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.one.hc.models.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
