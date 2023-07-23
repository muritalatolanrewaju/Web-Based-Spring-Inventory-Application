package com.example.demo.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import com.example.demo.domain.Part;
public class InventoryValidator implements ConstraintValidator<ValidInventory, Part> {
    public void initialize(ValidInventory constraint) {
    }
    public boolean isValid(Part part, ConstraintValidatorContext context) {
        if(part == null) {
            return true;
        }
        if(part.getInv() < part.getMinInventory()) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Inventory cannot be less than minimum inventory.")
                    .addConstraintViolation();
            return false;
        }
        if(part.getInv() > part.getMaxInventory()) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Inventory cannot be greater than maximum inventory.")
                    .addConstraintViolation();
            return false;
        }
        return true;
    }
}
