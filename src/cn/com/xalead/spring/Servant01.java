package cn.com.xalead.spring;

import org.springframework.stereotype.Component;

@Component
public class Servant01 implements MeInterface{
	public void makeBeds(){
		System.out.println("makeBeds");
	}

	@Override
	public void dowork() {
		makeBeds();		
	}
}
