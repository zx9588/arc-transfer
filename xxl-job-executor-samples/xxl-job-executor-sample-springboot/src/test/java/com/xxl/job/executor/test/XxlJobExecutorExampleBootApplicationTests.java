package com.xxl.job.executor.test;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;
import com.alibaba.fastjson2.JSON;
import com.xxl.job.executor.TestFileUtil;
import com.xxl.job.executor.excel.DemoData;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@Slf4j
@SpringBootTest
public class XxlJobExecutorExampleBootApplicationTests {

	@Test
	public void test() {
		System.out.println(11);


		String demoFile = TestFileUtil.getPath() + File.separator + "摄像头.xlsx";
		EasyExcel.read(demoFile, DemoData.class, new PageReadListener<DemoData>(demoDataList -> {
			for (DemoData demoData : demoDataList) {
				log.info("读取到一条数据{}", JSON.toJSONString(demoData));
			}
		}, 100)).sheet(0).headRowNumber(1).doRead();

	}

}