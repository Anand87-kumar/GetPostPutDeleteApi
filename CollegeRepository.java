package com.anand.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anand.springboot.model.College;

public interface CollegeRepository extends JpaRepository<College, Long>{

}
