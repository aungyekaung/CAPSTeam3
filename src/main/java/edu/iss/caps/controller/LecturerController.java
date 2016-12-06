package edu.iss.caps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.iss.caps.service.LecturerService;
import edu.iss.cats.service.CourseService;

@Controller
@RequestMapping(value = "/LecturerManagement")

public class LecturerController {

		//R,U Course,Grade by lecturer
	@Autowired
	private LecturerService lService;
	
	@Autowired
	private 

}
