package org.example.practice.validator;

import org.example.practice.DataWriteValidateContext;

/**
 * 写数据校验器接口（主要目的在于提供模版方法）
 */
public interface DataWriteValidatorService {
    /**
     * 执行校验
     */
    void doValidate(DataWriteValidateContext context);
}
