package com.springmvc.customannotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy=EmptyRangeValidator.class)
@Retention(RUNTIME)
@Target(
{ FIELD, METHOD })
public @interface EmptyOrRange
	{
	
	String message() default "Number must be {min} to {max} length";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
	int min();
	int max();

	}
