package com.xxl.job.executor.service.jobhandler;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.executor.mqtt.MqttGateway;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author zhangxin
 */
@Component
@Slf4j
public class HikvisionXxlJob {

//    @Resource
//    DeviceService deviceService;

    @Resource
    MqttGateway mgttGateway;

    /**
     * 1、简单任务示例（Bean模式）
     */
    @XxlJob("hkJobHandler")
    public void hkJobHandler() throws Exception {
        XxlJobHelper.log("开始任务1!!!");
//
//        List<Device> devicelist = deviceService.listByType("EM", "EM_EP_T");
//        for (Device device : devicelist) {
//            Integer value = device.getValue();
//            device.setValue(value);
//            deviceService.updateById(device);
//
////            Integer value = device.getValue() + getRandomValue(20.0);
//            Map<String, Object> info = new HashMap<>();
//            Map<String, String> data = new HashMap<>();
//            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
//            info.put("time", df.format(new Date()));
//            info.put("data", data);
//
//            data.put("EM_EP_T", String.valueOf(value));
//            data.put("EM_EP-P", String.valueOf(value));
//
//            // 1. `thing/${TENANT_ID}/device/${DESIGN_CODE}/post`
//            mgttGateway.sendToMqtt("thing/144859913695330576/device/" + device.getCode() + "/post",
//                    JSONObject.toJSONString(info));
//            Thread.sleep(1001);
//        }
    }


}
