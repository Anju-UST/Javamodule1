package com.ust.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FirstTest {
  @Test(priority=1, description="excuted firdt when priority is there")
  public void f() {
	  System.out.println("from test method f");
  }
  @Test(priority=2, description="tests a")
  public void a() {
	  System.out.println("from test method a");// go in alphabetically order
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("from beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("from aftertest");
  }
	  
  }


