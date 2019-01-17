package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import hello.Greeting;
import hello.HelloSpring;
import hello.impl.GreetingService;

public class TestHelloSpring {
	@Test
	public void test1(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloSpring helloSpring=(HelloSpring)context.getBean("helloSpring");
		helloSpring.print();
	}
	@Test
	public void greeting(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext-Spring.xml");
		Greeting zhangGa=(Greeting)context.getBean("zhangGa");
		GreetingService greetingService=(GreetingService)context.getBean("greetingService");
		greetingService.newsayGreeting(zhangGa);
	}
	@Test
	public void greeting1(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext-p.xml");
		Greeting zhangGa=(Greeting)context.getBean("zhangGa");
		GreetingService greetingService=(GreetingService)context.getBean("greetingService");
		greetingService.newsayGreeting(zhangGa);
	}
	
	
}
