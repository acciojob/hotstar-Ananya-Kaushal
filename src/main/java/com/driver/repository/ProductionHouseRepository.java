package com.driver.repository;

import com.driver.model.ProductionHouse;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProductionHouseRepository extends JpaRepository<ProductionHouse,Integer> {

}
