package com.xworkz.commonmodule.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Endgame21v02")
@Data
@NamedQueries({ @NamedQuery(name = "getByEmailId", query = "from Endgame21v02Entity as ed where ed.EmailId=:email") })

public class Endgame21v02Entity {
	@Id
	@Column(name = "ID")
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "FULL_NAME")
	private String fullName;
	
	@Column(name = "EMAIL_ID")
	private String EmailId;
	
	@Column(name = "DOB")
	private String dob;
	
	@Column(name = "CONTACT")
	private long contact;
	
	@Column(name = "ADDRESS")
	private String address;
	
	@Column(name = "GENDER")
	private String gender;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "REGISTEREDBY")
	private String registeredBy;
	
	@Column(name = "REGISTERED_DATE")
	private String registeredDate;
	
	

}
