package wenyang.home.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.xalead.spring.MeInterface;
import cn.com.xalead.spring.MyProxy;

public class MainTest2 {
	static BeanFactory bf;
	public static void main(String[] args) {
		bf= new ClassPathXmlApplicationContext("app*.xml");
//		ConstructDemo cd =(ConstructDemo)bf.getBean(ConstructDemo.class);
//		System.out.println("ConstructDemo:" + cd.getM().getMessage());
	
		MeInterface mi = (MeInterface) bf.getBean(MyProxy.class);
		mi.dowork();
		
	}

}
