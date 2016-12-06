package edu.iss.caps.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import edu.iss.caps.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
