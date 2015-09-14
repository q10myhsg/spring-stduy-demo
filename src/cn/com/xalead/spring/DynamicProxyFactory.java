package cn.com.xalead.spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class DynamicProxyFactory  implements InvocationHandler{
	
	private Object target;
	
	private DynamicProxyFactory(){
		
	}
	public static Object newInstance(Object target)
	{
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), new DynamicProxyFactory());
	
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] arg2)
			throws Throwable {
		// TODO Auto-generated method stub
		Object o = method.invoke(target, arg2);
		return o;
	}
	public Object getTarget() {
		return target;
	}
	public void setTarget(Object target) {
		this.target = target;
	}
	
	
}
