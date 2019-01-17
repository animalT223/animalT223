package hello.impl;

import hello.Greeting;

public class GreetingDao {
	//说话的方法
	public void sayGreeting(Greeting greeting){
		System.out.println(greeting.getPerson()+"说：“"+greeting.getWords()+"”");
	}
}
