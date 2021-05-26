package com.springmvc.customannotation;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DateValidator implements ConstraintValidator<DateConstraint, Date>
{
	
	public static final LocalDate EARIEST_DATE = LocalDate.of(1900, 1, 1);
	
	
	public static boolean validate(Date date) {
		if(date==null) {return false;}
		LocalDate value = date.toInstant().atZone(ZoneId.systemDefault())
			      .toLocalDate();
	
		LocalDate today = LocalDate.now();
		
		return((value.isAfter(EARIEST_DATE)) && (value.isBefore(today)));
		
	}

	@Override
	public void initialize(DateConstraint constraintAnnotation)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(Date value, ConstraintValidatorContext context)
	{
		// TODO Auto-generated method stub
		return validate(value);
	}

}
