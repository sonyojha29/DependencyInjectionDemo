package com.dependency;

public class EmailServiceInjector implements MyInjector{

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new EmailServiceImpl());
	}
	
	

}
