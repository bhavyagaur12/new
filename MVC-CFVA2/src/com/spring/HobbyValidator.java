package com.spring;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String> {
	
	private String ValidHobbies;
	
	@Override
	public void initialize (IsValidHobby isValidHobby){
		
		this.ValidHobbies=isValidHobby.ValidHobbies();
		
	}

	
	@Override
	public boolean isValid(String hobby,ConstraintValidatorContext ctx){
		
		
		if(hobby==null)
			return false;
		else{
			System.out.println("in else method");
			if(hobby.matches(ValidHobbies))
				return true;
			else
				return false;
		}
	}
	
	
}
