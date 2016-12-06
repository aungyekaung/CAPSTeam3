package edu.iss.caps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.iss.caps.model.Student;


public interface StudentRepository extends JpaRepository<Student,Integer>{

}
