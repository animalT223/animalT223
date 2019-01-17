package smbms.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import smbms.entity.User;
import smbms.service.UserService;

public class Test {
	@org.junit.Test
	public void test(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext-smbms.xml");
		UserService userService=(UserService)context.getBean("userService");
		User userCondition=new User();
		userCondition.setUserName("ут");
		userCondition.setUserRole(2);
		
		List<User> userList=new ArrayList<User>();
		userList=userService.findUsersWithConditions(userCondition);
		
		for(User userResult:userList){
			System.out.println("code:"+userResult.getUserCode()+",Name:"+userResult.getUserName());
		}
		
	}
}
