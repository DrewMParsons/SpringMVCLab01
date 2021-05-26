package com.springmvc.customannotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmptyRangeValidator implements ConstraintValidator<EmptyOrRange, Object>{
	
	int min;
	int max;
	
	@Override
	public void initialize(EmptyOrRange constraintAnnotation) {
		min = constraintAnnotation.min();
		max = constraintAnnotation.max();
	}

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		if(value==null) {return true;}
		StringBuilder bob = new StringBuilder().append(value);
		String newValue = bob.toString();
		if(newValue.isEmpty() || newValue.equals("0")) {
			value = 0;
			return true;//this is fine, field is optional
		}
		int len = newValue.length();
		return len <= max && len >= min;
	}

	

}