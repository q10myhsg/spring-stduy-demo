package cn.com.xalead.spring;

import org.springframework.stereotype.Component;

@Component
public class Servant02 implements MeInterface{
	public void dress(){
		System.out.println("dress");
	}

	@Override
	public void dowork() {
		// TODO Auto-generated method stub
		dress();
		
	}
}
