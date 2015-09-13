package cn.com.xalead.spring;

public class ConstructDemo {
	private int count;
	private String name;
	public ConstructDemo(String name,int count)
	{
		this.count=count;
		this.name=name;
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
	
			
}
