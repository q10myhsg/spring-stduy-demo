package cn.com.xalead.spring;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class ConstructDemo {
	private int count;
	private String name;
	@Resource(name="newMessage")
	private IMessage m;
	public ConstructDemo(String name,int count)
	{
		this.count=count;
		this.name=name;
	}
	public ConstructDemo()
	{

	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public IMessage getM() {
		return m;
	}
	public void setM(IMessage m) {
		this.m = m;
	}

}
