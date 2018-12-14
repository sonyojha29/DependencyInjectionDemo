package com.dependency;

public class SMSServiceInjector implements MyInjector{

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new SMSServiceImpl());
	}


}
