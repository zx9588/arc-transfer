package com.xxl.job.executor.service.jobhandler;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;
import com.alibaba.fastjson2.JSON;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.executor.TestFileUtil;
import com.xxl.job.executor.excel.DemoData;
import com.xxl.job.executor.mqtt.MqttGateway;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangxin
 */
@Component
@Slf4j
public class HikvisionXxlJob {

    @Value("${arc.os.tenantId}")
    private String tenantId;

//    @Resource
//    DeviceService deviceService;

    @Resource
    MqttGateway mgttGateway;

    private static final OkHttpClient client = new OkHttpClient();

    /**
     * 1、简单任务示例（Bean模式）
     */
    @XxlJob("hkJobHandler")
    public void hkJobHandler() throws Exception {
        XxlJobHelper.log("开始任务1...");

        XxlJobHelper.log("获取海康数据...");
//
//        // 获取接口调用凭据 | 微信开放文档 https://developers.weixin.qq.com/miniprogram/dev/OpenApiDoc/mp-access-token/getAccessToken.html
//        Response executed4Token = client.newCall(new Request.Builder()
//                .url(HttpUrl.get("https://api.weixin.qq.com/cgi-bin/token").newBuilder()
//                        .addQueryParameter("grant_type", "client_credential")
//                        .addQueryParameter("appid", "wx8f70209bb318ea52")
//                        .addQueryParameter("secret", "63c542cf13e1c78925911afaf7066648")
//                        .build()).build()).execute();
//        String executed4TokenString = executed4Token.body().string();
//        JSONObject executed4TokenJsonObject = JSONObject.parseObject(executed4TokenString);
//        Integer errCode = executed4TokenJsonObject.getInteger("errcode");
//        Assert.isNull(errCode, "微信小程序平台报错: " + executed4TokenJsonObject.getString("errmsg"));
////        Assert.isTrue(Objects.equals(errCode, 200), "微信小程序平台报错: " + executed4TokenJsonObject.getString("errmsg"));
//        String accessToken = executed4TokenJsonObject.getString("access_token");

        XxlJobHelper.log("导入到ArcOS...");
//
//        List<Device> devicelist = deviceService.listByType("EM", "EM_EP_T");
//        for (Device device : devicelist) {
//            Integer value = device.getValue();
//            device.setValue(value);
//            deviceService.updateById(device);

//            Integer value = device.getValue() + getRandomValue(20.0);


        String demoFile = TestFileUtil.getPath() + File.separator + "1、临港监控清册V1.0.xlsx.xlsx";
        EasyExcel.read(demoFile, DemoData.class, new PageReadListener<DemoData>(demoDataList -> {
            for (DemoData demoData : demoDataList) {
                log.info("读取到一条数据{}", JSON.toJSONString(demoData));
            }
        }, 100)).sheet(0).headRowNumber(1).doRead();

        Map<String, Object> info = new HashMap<>();
        Map<String, String> data = new HashMap<>();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
        info.put("time", df.format(LocalDateTime.now()));
        info.put("data", data);

//            data.put("CAM_VURL", "rtsp://admin:a12345678@"+ ip + ":554/h264/ch1/sub/av_stream");
//
//            mgttGateway.sendToMqtt("thing/" + tenantId + "/device/" + device.getCode() + "/post",
//                    JSONObject.toJSONString(info));
//            Thread.sleep(1001);
    }
}
