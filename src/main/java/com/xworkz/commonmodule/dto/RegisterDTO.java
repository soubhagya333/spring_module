package com.xworkz.commonmodule.dto;
import lombok.Data;

@Data

public class RegisterDTO {
	private String fullName;
	private String EmailId;
	private String dob;
	private long contact;
	private String address;
	private String gender;
	private String password;

}
