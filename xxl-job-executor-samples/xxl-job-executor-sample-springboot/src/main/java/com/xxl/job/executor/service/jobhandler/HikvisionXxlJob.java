package com.xxl.job.executor.service.jobhandler;

import com.alibaba.fastjson2.JSONObject;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.executor.mqtt.MqttGateway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.apache.logging.log4j.message.MapMessage.MapFormat.JSON;

/**
 * XxlJob开发示例（Bean模式）
 * <p>
 * 开发步骤：
 * 1、任务开发：在Spring Bean实例中，开发Job方法；
 * 2、注解配置：为Job方法添加注解 "@XxlJob(value="自定义jobhandler名称", init = "JobHandler初始化方法", destroy = "JobHandler销毁方法")"，注解value值对应的是调度中心新建任务的JobHandler属性的值。
 * 3、执行日志：需要通过 "XxlJobHelper.log" 打印执行日志；
 * 4、任务结果：默认任务结果为 "成功" 状态，不需要主动设置；如有诉求，比如设置任务结果为失败，可以通过 "XxlJobHelper.handleFail/handleSuccess" 自主设置任务结果；
 *
 * @author xuxueli 2019-12-11 21:52:51
 */
@Component
public class HikvisionXxlJob {
    private static Logger logger = LoggerFactory.getLogger(HikvisionXxlJob.class);

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
