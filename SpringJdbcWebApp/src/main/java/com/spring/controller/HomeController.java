package com.spring.controller;
 
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.dao.PatientDao;
import com.spring.model.Patient;

public class HomeController {

	@Autowired
	private PatientDao patientDao;
	@RequestMapping(value="/")
	public ModelAndView listContact(ModelAndView model) throws IOException{
	List<Patient> listPatient = patientDao.list();
    model.addObject("listPatient", listPatient);
	model.setViewName("home");
	return model;
	}
	
	@RequestMapping(value = "/newPatient", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
	Patient newPatient = new Patient();
	model.addObject("contact", newPatient);
	model.setViewName("PatientForm");
	return model;
	}
	@RequestMapping(value = "/savePatient", method = RequestMethod.POST)
	public ModelAndView saveContact(@ModelAttribute Patient patient) {
	patientDao.saveOrUpdate(patient);
	return new ModelAndView("redirect:/");
	}
	@RequestMapping(value = "/deletePatient", method = RequestMethod.GET)
	public ModelAndView deleteContact(HttpServletRequest request) {
	int patientID = Integer.parseInt(request.getParameter("id"));
	patientDao.delete(patientID);
	return new ModelAndView("redirect:/");
	}
	@RequestMapping(value = "/editPatient", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
	int patientId = Integer.parseInt(request.getParameter("id"));
	Patient patient = patientDao.get(patientId);
	ModelAndView model = new ModelAndView("PatientForm");
	model.addObject("patient", patient);
	return model;
	}
	
}
