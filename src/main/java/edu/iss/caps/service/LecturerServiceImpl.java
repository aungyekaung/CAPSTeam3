package edu.iss.caps.service;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Transactional;

import edu.iss.caps.model.Lecturer;
import edu.iss.cats.model.Course;

public class LecturerServiceImpl implements LecturerService {

	@Override
	@Transactional
	public ArrayList<Lecturer> searchAllLecturers()
	{
		
	}

	@Override
	@Transactional
	public Lecturer findLecturer(Integer LecId)
	{
		ArrayList<Lecturer> l = (ArrayList<Lecturer>) courseRepository.findAll();
		return l;	
	}

	@Override
	@Transactional
	public Lecturer addLecturer(Lecturer lecturer)
	{
		
	}

	@Override
	@Transactional
	public Lecturer changeLecturer(Lecturer lecturer)
	{
		
	}

	@Override
	@Transactional
	public void removeLecturer(Lecturer lecturer){
		
	}

	@Override
	@Transactional
	public ArrayList<Lecturer> findLecturerByLID(String lId)
	{
		
	}

}
