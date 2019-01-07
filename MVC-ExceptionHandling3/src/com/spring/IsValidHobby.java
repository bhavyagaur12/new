package com.spring;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy= HobbyValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidHobby {
	String ValidHobbies() default "Music|TT|Cricket|Dance";
	
	String message() default "please enter a valid hobby accepted hobbies are Music ,TT and Cricket";
	
	Class<?>[] groups() default {};
	
	Class <? extends Payload >[] payload() default {};
	
	

}
