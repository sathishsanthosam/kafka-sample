package com.vzt.demo.consumer;

import org.springframework.kafka.annotation.KafkaListener;

public class SwapAddConsumer {
	
	public int count = 0;
	
	@KafkaListener(topics= "${kafka.topic.helloworld}")
	public void onMessage(String message){
		if(message.contains("AssociationStartTimestamp")){
			System.out.println("Has AssociationStartTimestamp");
		}else{
			System.out.println(message);
			System.out.println("Count : " +  ++count);
		}
		
	}

}
