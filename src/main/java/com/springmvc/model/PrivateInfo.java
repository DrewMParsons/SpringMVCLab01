package com.springmvc.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class PrivateInfo
{
	private long ssn;
	private long ccn;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dob;
	public long getSsn()
	{
		return ssn;
	}
	public void setSsn(long ssn)
	{
		this.ssn = ssn;
	}
	public long getCcn()
	{
		return ccn;
	}
	public void setCcn(long ccn)
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
