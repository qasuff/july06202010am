package Testngdemo;

import org.testng.annotations.Test;

public class day2 
{

	@Test
	public void personalbank1()
	{
		
	 System.out.println("personal banking");
	}
	
	@Test
	public void corporate()
	{
		System.out.println("corporate banking");
	}
	
	@Test
	public void internalbank()
	{
		System.out.println("InternalBank");
	}
	@Test(dependsOnMethods={"personalbank1"})
	
    public void appaccount()
	{
		System.out.println("app account");
	}
	@Test
	public void zaccount()
	{
		System.out.println("Z account");
	}
	
}
