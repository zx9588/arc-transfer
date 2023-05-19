package com.xxl.job.executor.service.jobhandler;

import lombok.extern.slf4j.Slf4j;

/**
 * Device
 *
 * @author zhangxin
 * @since 2023/5/18
 */
@Slf4j
public class Device {
    private Integer value;
    private String code;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
