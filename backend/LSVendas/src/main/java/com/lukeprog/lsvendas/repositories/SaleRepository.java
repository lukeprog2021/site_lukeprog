package com.lukeprog.lsvendas.repositories;

import com.lukeprog.lsvendas.dto.SaleSuccessDTO;
import com.lukeprog.lsvendas.dto.SaleSumDTO;
import com.lukeprog.lsvendas.entities.Sale;
import com.lukeprog.lsvendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {
    @Query("SELECT new  com.lukeprog.lsvendas.dto.SaleSumDTO(obj.seller, SUM (obj.amount))FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new  com.lukeprog.lsvendas.dto.SaleSuccessDTO(obj.seller, SUM (obj.visited), SUM (obj.deals))FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSuccessDTO> successGroupedBySeller();
}
