package cn.com.xalead.spring;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Me {
	@Resource
	private Servant01 servant01;
	@Resource
	private Servant02 servant02;
	@Resource
	private Servant03 servant03;
	@Resource
	private Servant04 servant04;
	
	public void dowork(){
		servant01.makeBeds();
		servant02.dress();
		servant03.haveAMeal();
		System.out.println("真正工作...........");
		servant03.haveAMeal();
		servant01.makeBeds();
		servant04.undress();
	}
//	
//	private void makeBeds(){
//		System.out.println("������");
//	}
//	
//	private void dress(){
//		System.out.println("���·�");
//	}
//	
//	private void haveAMeal(){
//		System.out.println("�Է�");
//	}
//	
//	private void undress(){
//		System.out.println("���·�");
//	}
}
