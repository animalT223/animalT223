package hello.impl;

import hello.Greeting;

public class GreetingDao {
	//˵���ķ���
	public void sayGreeting(Greeting greeting){
		System.out.println(greeting.getPerson()+"˵����"+greeting.getWords()+"��");
	}
}
