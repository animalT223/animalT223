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
		String content="������ɳʼ���𣬽��Ӽ���ɳ��ĥ����ԭ��Ҳ����ɳ�У�÷�����Կຮ����û�о�����ѩ��ĥ�ѣ�����÷���־õķҷ������˶�Ҫ���ӣ�����Ҫɳ�ӣ��벻֪û��ɳ�Ӿ�û�н��ӡ��ѹ������ɾ͵����٣������ɾ͵��˵������ǡ�ԭ�����������ƽӹ��ǫ���ѧ֮����ͲŻ���ĥ��Ҳ��һ��ѧϰ�����γɲŻ�����Ҫ���ء�";
		printer.print(content);
	}
}
