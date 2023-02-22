package com.springdatajpa.springdatajpa;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Productrepository extends JpaRepository<Product, Integer>{
    List<Product> findByPriceLessThan(int price);
    List<Product> findById(int id);
}
