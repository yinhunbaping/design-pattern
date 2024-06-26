package org.example.practice.validator.impl;

import org.example.practice.DataWriteValidateContext;
import org.example.practice.validator.DataWriteValidatorService;
import org.springframework.stereotype.Component;

/**
 * 校验删除逻辑
 */
@Component
public class ValidateDeleteLogicOne implements DataWriteValidatorService {

    @Override
    public void doValidate(DataWriteValidateContext context) {
        // do something
        System.out.println("删除校验");
    }
}
