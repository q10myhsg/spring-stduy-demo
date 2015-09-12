package cn.com.xalead.spring;

import java.util.ResourceBundle;

public class MessageFactroy {
	public static IMessage create(String key){
//		if("1".equals(key)){
//			return new Message();
//		}
		ResourceBundle bundle = ResourceBundle.getBundle("message");
		String c = bundle.getString(key);
		try {
			return (IMessage)Class.forName(c).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
