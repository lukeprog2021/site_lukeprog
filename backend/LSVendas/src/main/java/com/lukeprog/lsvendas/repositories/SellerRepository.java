package com.lukeprog.lsvendas.repositories;

import com.lukeprog.lsvendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
