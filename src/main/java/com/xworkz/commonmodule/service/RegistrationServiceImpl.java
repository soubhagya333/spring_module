package com.xworkz.commonmodule.service;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.xworkz.commonmodule.dto.RegisterDTO;
import com.xworkz.commonmodule.entity.Endgame21v02Entity;
import com.xworkz.commonmodule.repository.Endgame21v02Repo;

@Service

public class RegistrationServiceImpl implements RegistrationService {
	private Logger logger;

	@Autowired
	private Endgame21v02Repo repo;

	public RegistrationServiceImpl() {
		logger = Logger.getLogger(getClass());
	}

	public String validateAndSave(RegisterDTO dto) {
		logger.info("inside {} ");
		Endgame21v02Entity entity = new Endgame21v02Entity();
		try {
			
			Endgame21v02Entity edEntity = repo.getByEmailId(dto.getEmailId());
			if (edEntity == null) {
				
				BeanUtils.copyProperties(dto, entity);
				
				entity.setRegisteredBy("unstoppable");

				LocalDateTime ldate = LocalDateTime.now();
				
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
				
				String date = formatter.format(ldate);
				
				entity.setRegisteredDate(date);

				int affectedRows=repo.save(entity);
				if (affectedRows > 0 ) {
					logger.info("yes!!!!!user successfully registered");
					return "yes!!!!user successfully registered";
				}else {
					logger.info("user is not registered");
					return "user is not registered";
				}
				
			}
			else {
				logger.info("no database saved!!!user already exist");
				return " no database saved!!!!user already exist";
			}
		} catch (Exception e) {
			logger.error("sorry!!!!you have an Exception in {} "+ e.getMessage(),e);
		}
		return "";
	}
}
