package org.example.practice.contain;

import org.example.practice.DataWriteTypeEnum;
import org.example.practice.validator.DataWriteValidatorService;

import java.util.List;

/**
 * 写数据接口
 */
public interface DataWriteService {

    /**
     * 获取校验器
     */
    List<DataWriteValidatorService> getAllValidator();

    /**
     * 获取写入类型
     */
    DataWriteTypeEnum getWriteType();
}
