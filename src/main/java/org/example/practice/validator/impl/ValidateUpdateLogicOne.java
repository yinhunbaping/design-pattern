package org.example.practice.validator.impl;

import org.example.practice.DataWriteValidateContext;
import org.example.practice.validator.DataWriteValidatorService;
import org.springframework.stereotype.Component;

/**
 * 校验更新逻辑
 */
@Component
public class ValidateUpdateLogicOne implements DataWriteValidatorService {

    @Override
    public void doValidate(DataWriteValidateContext context) {
        // do something
        System.out.println("更新校验");
    }
}
