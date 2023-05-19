package com.xxl.job.executor.mqtt;


public interface MqttReceiveService {

    void handlerMqttMessage(String topic, String jsonData) throws Exception;

}
