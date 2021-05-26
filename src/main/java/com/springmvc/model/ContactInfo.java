package com.springmvc.model;

import javax.validation.constraints.NotNull;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import com.springmvc.customannotation.EmailConstraint;
import com.springmvc.customannotation.EmptyOrRange;

//DONE:Phone Number - optional, must be 10 digit if provided
//TODO:Email - required, must follow email constraints
public class ContactInfo
{
	
	
	
	@EmptyOrRange(min=9,max=10)
	private Long phone;
	
	

	@NotEmpty(message = "Please enter your email addresss.")
	@Email
	private String email;
	
	private String linkedInURL;
	
	public Long getPhone()
	{
		return phone;
	}
	public void setPhone(Long phone)
	{
		this.phone = phone;
	}
	
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getLinkedInURL()
	{
		return linkedInURL;
	}
	public void setLinkedInURL(String linkedInURL)
	{
		this.linkedInURL = linkedInURL;
	}
	
	

}
