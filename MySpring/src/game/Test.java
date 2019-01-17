package game;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import game.entity.Equip;
import game.entity.Player;

public class Test {
	ApplicationContext context=new ClassPathXmlApplicationContext("game.xml");
	@org.junit.Test
	public void test(){
		Player zhangsan=(Player)context.getBean("zhangsan");
		Equip lanmoRing=(Equip)context.getBean("lanmoRing");
		zhangsan.say(lanmoRing);
	}
	@org.junit.Test
	public void update(){
		Equip lanmoRing=(Equip)context.getBean("lanmoRing");
		System.out.println(lanmoRing.getType());
		Player player=new Player();
		player.setRing(lanmoRing);
		lanmoRing.setName("×ÏÉ«ÃÎ»Ã-"+lanmoRing.getName());
		lanmoRing.setAttackPlus(lanmoRing.getAttackPlus()+6);
		lanmoRing.setDefencePlus(lanmoRing.getDefencePlus()+6);
		player.updateEquip(lanmoRing);
		player.say(lanmoRing);
	}
}
