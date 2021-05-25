package com.xworkz.commonmodule.controller;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.commonmodule.dto.RegisterDTO;
import com.xworkz.commonmodule.service.RegistrationService;

@Controller
@RequestMapping("/")
public class RegisterController {
	
private static Logger logger;
	
	@Autowired
	private RegistrationService registrationService;

	public RegisterController() {
		logger = Logger.getLogger(getClass());
		
	}

	@RequestMapping("/registration.do")
	@PostMapping
	public ModelAndView register(RegisterDTO RegisterDTO) {
		logger.info("invoking register()");
		
		ModelAndView modelAndView = new ModelAndView("index");
		
		try {
			String msg = registrationService.validateAndSave(RegisterDTO);
			modelAndView.addObject("msg", msg + RegisterDTO.getFullName());
			
		} catch (Exception e) {
			logger.error("sorry!!!!!you have an exception in " + e.getMessage(), e);
		}

		return modelAndView;
	
	}

}
