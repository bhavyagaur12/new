package com.spring;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String> {
	
	@Override
	public void initialize (IsValidHobby isValidHobby){
		
	}

	
	@Override
	public boolean isValid(String hobby,ConstraintValidatorContext ctx){
		
		if(hobby==null)
			return false;
		else{
			System.out.println("in else method");
			if(hobby.matches("Music|TT"))
				return true;
			else
				return false;
		}
	}
	
	
}
