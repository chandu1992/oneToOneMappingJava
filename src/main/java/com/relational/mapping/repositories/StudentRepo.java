package com.relational.mapping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.relational.mapping.oneToOne.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
