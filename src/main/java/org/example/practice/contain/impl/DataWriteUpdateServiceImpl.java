package org.example.practice.contain.impl;

import org.example.practice.DataWriteTypeEnum;
import org.example.practice.contain.DataWriteService;
import org.example.practice.validator.DataWriteValidatorService;
import org.example.practice.validator.impl.ValidateDBExist;
import org.example.practice.validator.impl.ValidateUpdateLogicOne;
import org.example.practice.validator.impl.ValidateVersion;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * update校验容器
 */
@Component
public class DataWriteUpdateServiceImpl implements DataWriteService {
    @Resource
    private ValidateUpdateLogicOne validateUpdateLogicOne;

    @Resource
    private ValidateVersion validateVersion;

    @Resource
    private ValidateDBExist validateDBExist;

    private List<DataWriteValidatorService> updateValidatorServiceList;

    @PostConstruct
    private void init() {
        updateValidatorServiceList = Arrays.asList(validateUpdateLogicOne, validateVersion, validateDBExist);
    }

    @Override
    public List<DataWriteValidatorService> getAllValidator() {
        return updateValidatorServiceList;
    }

    @Override
    public DataWriteTypeEnum getWriteType() {
        return DataWriteTypeEnum.UPDATE;
    }
}
