package com.lukeprog.lsvendas.repositories;

import com.lukeprog.lsvendas.entities.Sale;
import com.lukeprog.lsvendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
