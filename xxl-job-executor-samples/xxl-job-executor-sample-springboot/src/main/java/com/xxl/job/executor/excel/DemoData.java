package com.xxl.job.executor.excel;


import com.alibaba.excel.annotation.ExcelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * 基础数据类 无任何注解时，默认按字段顺序映射excel标题
 *
 * @author zhangxin
 * @since 2023-03-22
 **/
@Getter
@Setter
@EqualsAndHashCode
public class DemoData {

    @ExcelProperty("设计编号")
    private String designCode;

    @ExcelProperty("IP")
    private String ip;

}
