 package com.rahul.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.entity.Student;

//in simple repository always @Repository 
public interface StudentRepository extends JpaRepository<Student, Long> {

	
}
