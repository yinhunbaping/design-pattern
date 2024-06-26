package org.example.practice.validator.impl;

import org.example.practice.DataWriteValidateContext;
import org.example.practice.validator.DataWriteValidatorService;
import org.springframework.stereotype.Component;

/**
 * 校验DB是否存在
 */
@Component
public class ValidateDBExist implements DataWriteValidatorService {

    @Override
    public void doValidate(DataWriteValidateContext context) {
        // do something
        System.out.println("DB是否存在校验");
    }
}
