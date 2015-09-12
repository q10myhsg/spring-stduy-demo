package cn.com.xalead.spring;

public class Message implements IMessage {
	/* (non-Javadoc)
	 * @see cn.com.xalead.spring.IMessage#getMessage()
	 */
	@Override
	public String getMessage(){
		return "Hello World !";
	}
}
