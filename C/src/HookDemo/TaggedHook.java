package HookDemo;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TaggedHook {
	
	@Before("@HRIT")
	public void before()
	{
		System.out.println("we are tagged hook before");
	}
	
	@After("@HR")
	public void after()
	{
		System.out.println("we are tagged hook after");
	}

}
