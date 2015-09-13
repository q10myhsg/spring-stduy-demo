package cn.com.xalead.spring;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MeTest {

	BeanFactory bf;
	@Before
	public void setUp() throws Exception {
		bf =  new ClassPathXmlApplicationContext("app*.xml");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDowork() {
		Me me = bf.getBean(Me.class);
		me.dowork();
	}

}
