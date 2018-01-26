package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rabbitMQ.Receiver;

@RestController
@RequestMapping("/html")
public class testController {
	Logger logger = LoggerFactory.getLogger(testController.class);
	/*@Autowired
	private Receiver receiver;*/
	@RequestMapping("/")
	public String html(String par){
		System.out.println("测试,,,,,,,,,,par="+par);
		logger.info("测试,,,,,,,,,,par="+par);
		/*receiver.process(msg);*/
		return "ok";
	}
}
