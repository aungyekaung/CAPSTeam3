package edu.iss.caps.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import edu.iss.caps.model.Lecturer;



public interface LecturerRepository  extends JpaRepository<Lecturer, Integer>{

	@Query("SELECT l from lecturer l WHERE l.LecturerID = :lID")
	ArrayList<Lecturer> findLecturerByLID(@Param("lID") String lID);

}
