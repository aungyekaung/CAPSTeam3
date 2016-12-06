package edu.iss.caps.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import edu.iss.caps.model.Lecturer;
import edu.iss.caps.repository.LecturerRepository;

public class LecturerServiceImpl implements LecturerService {
	
	@Resource
	private LecturerRepository lecRepo;
	
	@Override
	@Transactional
	public ArrayList<Lecturer> findAllLecturers()
	{
			ArrayList<Lecturer> ul = (ArrayList<Lecturer>) lecRepo.findAll();
			return ul;

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
