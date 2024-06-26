package org.example.practice.contain.impl;

import org.example.practice.DataWriteTypeEnum;
import org.example.practice.contain.DataWriteService;
import org.example.practice.validator.DataWriteValidatorService;
import org.example.practice.validator.impl.ValidateAddLogicOne;
import org.example.practice.validator.impl.ValidateDBExist;
import org.example.practice.validator.impl.ValidateVersion;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * add校验容器
 */
@Component
public class DataWriteAddServiceImpl implements DataWriteService {

    @Resource
    private ValidateAddLogicOne validateAddLogicOne;

    @Resource
    private ValidateVersion validateVersion;

    @Resource
    private ValidateDBExist validateDBExist;

    private List<DataWriteValidatorService> addValidatorServiceList;

    @PostConstruct
    private void init() {
        addValidatorServiceList = Arrays.asList(validateAddLogicOne, validateVersion, validateDBExist);
    }

    @Override
    public List<DataWriteValidatorService> getAllValidator() {
        return addValidatorServiceList;
    }

    @Override
    public DataWriteTypeEnum getWriteType() {
        return DataWriteTypeEnum.ADD;
    }
}
