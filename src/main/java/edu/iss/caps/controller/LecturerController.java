package edu.iss.caps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.iss.caps.model.Lecturer;
import edu.iss.caps.service.LecturerService;
import edu.iss.cats.model.User;
import edu.iss.cats.service.CourseService;

@Controller
@RequestMapping(value = "/LManage")

public class LecturerController {

		//R,U Course,Grade by lecturer
	@Autowired
	private LecturerService lService;
	

	
	@RequestMapping(value = "/LList", method = RequestMethod.GET)
	public ModelAndView LecturerListPage() {
		ModelAndView mav = new ModelAndView("LecturerList");
		List<Lecturer> lecList = lService.findAllLecturers();
		mav.addObject("lecList", lecList);
		return mav;
	}

}
