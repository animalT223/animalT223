package hello.impl;

import hello.Greeting;

public class GreetingService {
	private GreetingDao dao;
	
	public GreetingDao getDao() {
		return dao;
	}
	public void setDao(GreetingDao dao) {
		this.dao = dao;
	}
	public GreetingService(){
		
	}
	public GreetingService(GreetingDao dao){
		this.dao=dao;
	}
	public void newsayGreeting(Greeting greeting){
		dao.sayGreeting(greeting);
	}
}
