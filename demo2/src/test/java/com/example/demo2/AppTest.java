package com.example.demo2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest 
    {
  
	@Test
	 public void addValidTest() {
		
		App app=new App();
		int expected=10;
		int actual=app.add(8,2);
		Assertions.assertEquals(expected,actual);
	 }
	@Test
	 public void addInValidTest1() {
		App app=new App();
		
		int expected=0;
		int actual=app.add(0,0);
		Assertions.assertEquals(expected,actual);
	 }
	
	@Test
	 public void addInValidTest2() {
		App app=new App();
		int expected=0;
		int actual=app.add(-1,-2);
		Assertions.assertEquals(expected,actual);
	 }
	@Test
	 public void addInValidTest3() {
		App app=new App();
		int expected=1;
		int actual=app.add(-1,2);
		Assertions.assertEquals(expected,actual);
	 }
	
	@Test
	 public void addInValidTest4() {
		App app=new App();
		int expected=-1;
		int actual=app.add(101,102);
		Assertions.assertEquals(expected,actual);
	 }
	
	@Test
	 public void addInValidTest5() {
		App app=new App();
		int expected=-1;
		int actual=app.add(100,100);
		Assertions.assertEquals(expected,actual);
	 }
	
	@Test
	 public void addInValidTest6() {
		App app=new App();
		int expected=-1;
		int actual=app.add(101,100);
		Assertions.assertEquals(expected,actual);
	 }
	@Test
	 public void addInValidTest7() {
		App app=new App();
		int expected=-1;
		int actual=app.add(100,101);
		Assertions.assertEquals(expected,actual);
	 }
	
	@Test
	 public void addInValidTest8() {
		App app=new App();
		int expected=111;
		int actual=app.add(10,101);
		Assertions.assertEquals(expected,actual);
	 }
	@Test
	 public void addInValidTest9() {
		App app=new App();
		int expected=110;
		int actual=app.add(100,10);
		Assertions.assertEquals(expected,actual);
	 }
}

