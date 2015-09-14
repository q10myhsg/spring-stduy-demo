package cn.com.xalead.spring;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
@Component
public class MyProxy implements MeInterface {
	@Resource
	private Servant01 servant01;
	@Resource
	private Servant02 servant02;
	@Resource
	private Servant03 servant03;
	@Resource
	private Servant04 servant04;
	@Resource 
	private Me me;
	
	
	@Override
	public void dowork() {
		servant01.dowork();
		servant02.dowork();
		me.dowork();
		servant03.dowork();
		servant04.dowork();
	}

}
