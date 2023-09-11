package HookDemo;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookDemo {
	
	@Before(order=0)
	public void before()
	{
		System.out.println("am execute before order0");
	}
	
	@After(order=0)
	public void after()
	{
		System.out.println("am execute after order0");

	}
	
	@Before(order=1)
	public void before1()
	{
		System.out.println("am execute before order1");
	}
	
	@After(order=1)
	public void after1()
	{
		System.out.println("am execute after order1");

	}

}
