package org.example.practice.validator.impl;

import org.example.practice.DataWriteValidateContext;
import org.example.practice.validator.DataWriteValidatorService;
import org.springframework.stereotype.Component;

/**
 * 校验新增逻辑
 */
@Component
public class ValidateAddLogicOne implements DataWriteValidatorService {

    @Override
    public void doValidate(DataWriteValidateContext context) {
        // do something
        System.out.println("新增校验");
    }
}
