package edu.iss.caps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.iss.caps.model.Faculty;


public interface FacultyRepository extends JpaRepository<Faculty, Integer> {

}
