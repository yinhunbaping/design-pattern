package org.example.practice;

import org.example.practice.contain.DataWriteService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * 数据写入(具体业务名称可自己定义)校验管理者
 */
@Component
public class DataWriteValidateManager {
    @Resource
    private List<DataWriteService> dataWriteServiceList;

    public DataWriteService findHandler(DataWriteTypeEnum typeEnum) {
        return dataWriteServiceList.stream()
                .filter(Objects::nonNull)
                .filter(e -> Objects.equals(e.getWriteType(), typeEnum))
                .findFirst()
                .orElseThrow(RuntimeException::new);
    }
}
