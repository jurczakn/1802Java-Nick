package com.revature.messaging;

import org.springframework.kafka.annotation.KafkaListener;

public class Reciever {
	
	@KafkaListener(topics = "${spring.kafka.topic.helloworld}")
	public void recieve(String payload){
		
		System.out.println("recieved payload =" + payload);
		
	}

}
