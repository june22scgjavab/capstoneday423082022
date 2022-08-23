package com.example.demo2;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public  int add(int a,int b)
	{
		int result;
		if(a<=0 && b<=0) {
			return 0;
		}
		if(a>=100 && b>=100)
		{
			return -1;
		}
		
	   return a+b;
	}
	
	
	
  
}
