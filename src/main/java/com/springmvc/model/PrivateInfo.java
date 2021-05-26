package com.springmvc.model;
//DONE:credit Card Number - optional, must be 10-11 digit number if provided
//DONE:Dob required, must be between 1900-present
//DONE: Security Number - required, must be 9 digit number
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import com.springmvc.customannotation.DateConstraint;
import com.springmvc.customannotation.EmptyOrRange;

public class PrivateInfo
{
	
	@NotNull
	@EmptyOrRange(min=9,max=9)
	private Long ssn;
	
	
	
	@EmptyOrRange(min=10,max=11)
	private Long ccn;
	
	@NotNull
	@DateTimeFormat(pattern="yyyy-MM-dd") //for modern browsers
	@DateConstraint
	//@Past checks if date is in the past(includes today)
	private Date dob;
	
	public Long getSsn()
	{
		return ssn;
	}
	public void setSsn(Long ssn)
	{
		this.ssn = ssn;
	}
	public Long getCcn()
	{
		return ccn;
	}
	public void setCcn(Long ccn)
	{
		this.ccn = ccn;
	}
	public Date getDob()
	{
		return dob;
	}
	public void setDob(Date dob)
	{
		this.dob = dob;
	}
	
	public String getDobString()
	{
		
		return new SimpleDateFormat("MM-dd-yyyy").format(this.dob);
	}
	
	

}
