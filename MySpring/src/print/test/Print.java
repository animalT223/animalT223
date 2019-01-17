package print.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import print.entity.Printer;

public class Print {
	@Test
	public void test(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Printer printer=(Printer)context.getBean("printer");
		String content="吹尽黄沙始见金，金子既在沙中磨练，原本也出于沙中；梅花香自苦寒来，没有经历冰雪的磨难，岂有梅花持久的芬芳。世人都要金子，而不要沙子，孰不知没有沙子就没有金子。难怪有所成就的人少，无所成就的人到处都是。原来功名心造就平庸，谦虚好学之心造就才华。磨难也是一种学习，是形成才华的重要因素。";
		printer.print(content);
	}
}
