package org.example.practice.contain.impl;

import org.example.practice.DataWriteTypeEnum;
import org.example.practice.contain.DataWriteService;
import org.example.practice.validator.DataWriteValidatorService;
import org.example.practice.validator.impl.ValidateDBExist;
import org.example.practice.validator.impl.ValidateDeleteLogicOne;
import org.example.practice.validator.impl.ValidateVersion;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * delete校验容器
 */
@Component
public class DataWriteDeleteServiceImpl implements DataWriteService {
    @Resource
    private ValidateDeleteLogicOne validateDeleteLogicOne;

    @Resource
    private ValidateVersion validateVersion;

    @Resource
    private ValidateDBExist validateDBExist;

    private List<DataWriteValidatorService> deleteValidatorServiceList;

    @PostConstruct
    private void init() {
        deleteValidatorServiceList = Arrays.asList(validateDeleteLogicOne, validateVersion, validateDBExist);
    }

    @Override
    public List<DataWriteValidatorService> getAllValidator() {
        return deleteValidatorServiceList;
    }

    @Override
    public DataWriteTypeEnum getWriteType() {
        return DataWriteTypeEnum.DELETE;
    }
}
