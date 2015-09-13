package cn.com.xalead.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("newMessage")
@Scope("prototype")
public class NewMesssage implements IMessage{
	@Override
	public String getMessage() {
		return "Hello Every One !";
	}
}
