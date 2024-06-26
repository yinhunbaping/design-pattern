package org.example.practice;

import org.example.practice.contain.DataWriteService;
import org.example.practice.validator.DataWriteValidatorService;

import javax.annotation.Resource;
import java.util.List;

public class Main {
    @Resource
    private DataWriteValidateManager validateManager;

    public void test() {
        // 1、定义校验上下文
        DataWriteValidateContext context = new DataWriteValidateContext();

        // 2、通过工厂获取对象
        DataWriteService dataWriteService = validateManager.findHandler(DataWriteTypeEnum.ADD);

        // 3、拿到运行时类型对象的所有原子校验器
        List<DataWriteValidatorService> allValidator = dataWriteService.getAllValidator();

        // 4、遍历所有校验器，执行校验
        allValidator.forEach(e -> e.doValidate(context));


        // 当然上面2,3,4步骤，可以直接合为一步
        // 一键开启流水式校验
        validateManager.findHandler(DataWriteTypeEnum.ADD).getAllValidator().forEach(e -> e.doValidate(context));
    }

}
