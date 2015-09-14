package cn.com.xalead.spring;

import org.springframework.stereotype.Component;

@Component
public class Servant03 implements MeInterface{
	public void haveAMeal(){
		System.out.println("have a meal");
	}
	@Override
	public void dowork() {
		haveAMeal();
		
	}
}
