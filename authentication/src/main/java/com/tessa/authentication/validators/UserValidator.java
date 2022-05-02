package com.tessa.authentication.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.tessa.authentication.models.User;

@Component
public class UserValidator implements Validator {

	// supports does a dependency injection for class user 
	// uses word clazz because it cannot use class keyword
	// userValidator is going to validate the user class
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }
    
    // validate function takes in an object 
    // match keyword is the same keyword used in messages.properties
    // Checks to see if password = confirm password..
    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;
        
        if (!user.getPasswordConfirmation().equals(user.getPassword())) {
            errors.rejectValue("passwordConfirmation", "Match");
        }         
    }
}
