package com.relational.mapping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.relational.mapping.oneToMany.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long>{

}
