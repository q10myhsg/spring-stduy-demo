package cn.com.xalead.spring;

import org.springframework.stereotype.Component;

@Component("newMessage")
public class NewMesssage implements IMessage{
	@Override
	public String getMessage() {
		return "Hello Every One !";
	}
}
