package edu.iss.caps.service;

import java.util.ArrayList;

import edu.iss.caps.model.Lecturer;

public interface LecturerService {
	ArrayList<Lecturer> searchAllLecturers();

	Lecturer findLecturer(Integer LecId);

	Lecturer addLecturer(Lecturer lecturer);

	Lecturer changeLecturer(Lecturer lecturer);

	void removeLecturer(Lecturer lecturer);

	ArrayList<Lecturer> findLecturerByLID(String lId);

}
