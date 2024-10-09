package com.relational.mapping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.relational.mapping.oneToOne.entity.Laptop;

public interface LaptopRepo extends JpaRepository<Laptop, Integer>{

}
