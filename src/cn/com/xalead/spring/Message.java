package cn.com.xalead.spring;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
@Component("message")
public class Message implements IMessage {
	/* (non-Javadoc)
	 * @see cn.com.xalead.spring.IMessage#getMessage()
	 */
	
	String name;
	List<String> children;
	Map<String,String> hm;
	
	@Override
	public String getMessage()	{
		return  "message!!!";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getChildren() {
		return children;
	}
	public void setChildren(List<String> children) {
		this.children = children;
	}
	public Map<String, String> getHm() {
		return hm;
	}
	public void setHm(Map<String, String> hm) {
		this.hm = hm;
	}	
}
