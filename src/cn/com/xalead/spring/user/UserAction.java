package cn.com.xalead.spring.user;

public class UserAction {
	private UserManager manager;

	public UserManager getManager() {
		return manager;
	}

	public void setManager(UserManager manager) {
		this.manager = manager;
	}
	
	public void excute()
	{
		User u = new User();
		manager.addUser(u);
	}
	
}
