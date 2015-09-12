package wenyang.home.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.xalead.spring.IMessage;

public class MainTest1 {

	private static BeanFactory bf;

	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));;
		bf = new ClassPathXmlApplicationContext("applicationContext.xml");		
		IMessage msg = (IMessage) bf.getBean("a1");
		System.out.println(msg.getMessage());
//		bf.getBean("a1");

	}

}
