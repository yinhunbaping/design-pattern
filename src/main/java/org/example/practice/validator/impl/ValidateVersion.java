package org.example.practice.validator.impl;

import org.example.practice.DataWriteValidateContext;
import org.example.practice.validator.DataWriteValidatorService;
import org.springframework.stereotype.Component;

/**
 * 校验版本号
 */
@Component
public class ValidateVersion implements DataWriteValidatorService {

    @Override
    public void doValidate(DataWriteValidateContext context) {
        // do something
        System.out.println("版本号校验");
    }
}
