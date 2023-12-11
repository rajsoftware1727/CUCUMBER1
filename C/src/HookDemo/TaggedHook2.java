package HookDemo;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TaggedHook2 {
	
	@Before("@RA")
	public void before()
	{
		System.out.println("am tagged hook before");
	}
	
	@After("@Akila")
	public void after()
	{
		System.out.println("am tagged hook after");
	}

}
