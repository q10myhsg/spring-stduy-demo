package cn.com.xalead.spring;

import org.springframework.stereotype.Component;

@Component
public class Servant04 implements MeInterface{
	public void undress(){
		System.out.println("undress");
	}

	@Override
	public void dowork() {
		undress();
	}
}
