package com.springmvc.model;
//DONE:First Name - required, min length=2
//DONE:Last Name - required, min length=2
//DONE:User Name - required, must contain only letters and numbers
// TODO :LinkedIn URL - optional




import javax.validation.Valid;

//TODO:error messages have to be in red color

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class User
{
	
	@Size(min=2,message="Name must be longer than {min} characters")
	private String fName;
	
	
	@Size(min=2,message="Name must be longer than {min} characters")
	private String lName;
	
	@NotEmpty(message="This field cannot be empty")
	@Pattern(regexp="^[a-zA-Z0-9]*$",message="Username must only be numbers and/or letters")
	private String username;
	private String gender;
	@Valid
	private ContactInfo contactInfo;
	@Valid
	private PrivateInfo privateInfo;
	public String getfName()
	{
		return fName;
	}
	public void setfName(String fName)
	{
		this.fName = fName;
	}
	public String getlName()
	{
		return lName;
	}
	public void setlName(String lName)
	{
		this.lName = lName;
	}
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public ContactInfo getContactInfo()
	{
		return contactInfo;
	}
	public void setContactInfo(ContactInfo contactInfo)
	{
		this.contactInfo = contactInfo;
	}
	public PrivateInfo getPrivateInfo()
	{
		return privateInfo;
	}
	public void setPrivateInfo(PrivateInfo privateInfo)
	{
		this.privateInfo = privateInfo;
	}
	
	
	
}