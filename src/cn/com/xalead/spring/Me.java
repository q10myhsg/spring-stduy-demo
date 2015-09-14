package cn.com.xalead.spring;

import org.springframework.stereotype.Component;

@Component("me")
public class Me implements MeInterface {

	
	public void dowork(){
		System.out.println("真正工作...........");
	}
}
