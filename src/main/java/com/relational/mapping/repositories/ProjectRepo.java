package com.relational.mapping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relational.mapping.manyTomany.entity.Project;

public interface ProjectRepo extends JpaRepository<Project, Long> {

}
