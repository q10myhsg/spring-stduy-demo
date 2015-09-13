package wenyang.home.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.xalead.spring.ConstructDemo;
import cn.com.xalead.spring.IMessage;
import cn.com.xalead.spring.Message;
import cn.com.xalead.spring.user.UserAction;

public class MainTest1 {

	private static BeanFactory bf;

	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));;
		bf = new ClassPathXmlApplicationContext("applicationContext.xml");		
		IMessage msg = (IMessage) bf.getBean("a1");
		System.out.println(msg.getMessage());
//		bf.getBean("a1");
		UserAction ua =(UserAction) bf.getBean("userAction");
		ua.excute();	
		System.out.println(ua.hashCode());
		ua =(UserAction) bf.getBean("userAction");
		ua.excute();	
		System.out.println(ua.hashCode());
		/**
		 * 
		 * */

		Message m =(Message)bf.getBean("a1");
		/*
		 * list demo
		 * */
		System.out.println(m.getChildren().size());
		System.out.println(m.getChildren().get(0));
		/**
		 * hm
		 * */
		String key0 = m.getHm().keySet().toString();
		System.out.println(key0);
		
		ConstructDemo cd = (ConstructDemo) bf.getBean("constructDemo");
		System.out.println(cd.getCount());
		System.out.println(cd.getName());
		
		System.out.println("userId:"+cd.getM().getMessage());
		
	}

}
