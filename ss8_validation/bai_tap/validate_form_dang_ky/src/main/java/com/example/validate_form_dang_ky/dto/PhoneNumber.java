package com.example.validate_form_dang_ky.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class PhoneNumber implements Validator {

    private String number;

    public PhoneNumber() {
    }

    public PhoneNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        PhoneNumber phoneNumber = (PhoneNumber) target;
        String number = phoneNumber.getNumber();
        ValidationUtils.rejectIfEmpty(errors, "phoneNumber", "number.empty", "Data not empty!");
        if(number == null){
            errors.rejectValue("phoneNumber", "number.null");
        }else {
            if ( number.length()>11 || number.length()<10 ){
                errors.rejectValue("phoneNumber", "number.length");
            }
            if (!number.startsWith("0")){
                errors.rejectValue("phoneNumber", "number.startsWith");
            }
            if (!number.matches("(^$|[0-9]*$)")){
                errors.rejectValue("phoneNumber", "number.matches");
            }
        }

    }
}
