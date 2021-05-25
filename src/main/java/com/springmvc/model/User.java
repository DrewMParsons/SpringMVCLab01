package com.springmvc.model;

public class User
{
	private String fName;
	private String lName;
	private String username;
	private String gender;
	private ContactInfo contactInfo;
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