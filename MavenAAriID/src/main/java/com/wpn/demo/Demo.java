package com.wpn.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {
	
	 private static final Logger logger = LogManager.getLogger(Demo.class);
	public void say() {
		System.out.println("package com.wpn.demo;  say()ִ��");
		
	}
	
	public static void main(String[] args) {
		
		
        
		
//		PropertyConfigurator.configure("src/main/resources/config/log4j.properties");
		
		logger.info("��ǰ");
		System.out.println("package com.wpn.demo;  say()ִ�� 999  "+Thread.currentThread().getName());
		logger.info("��");
	}
}
