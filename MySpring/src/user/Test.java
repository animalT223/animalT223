package user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import user.service.UserService;

public class Test {
	@org.junit.Test
	public void test(){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService service=(UserService)ctx.getBean("service");
		service.addNewUser();
	}
}
