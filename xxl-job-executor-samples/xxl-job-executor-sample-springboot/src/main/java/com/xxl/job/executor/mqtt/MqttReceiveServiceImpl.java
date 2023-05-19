package com.xxl.job.executor.mqtt;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MqttReceiveServiceImpl implements MqttReceiveService {


    @Override
    public void handlerMqttMessage(String topic, String jsonData) throws Exception {
        log.info("this topic is ： " + topic + " ,this data : " + jsonData);
    }
}
