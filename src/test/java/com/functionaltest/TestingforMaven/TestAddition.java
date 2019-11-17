package com.functionaltest.TestingforMaven;

import org.junit.Assert;
import org.junit.Test;

public class TestAddition  {

	
 	 @Test
		public void test() {
 		 int number4=6;
 		
 		
 		Assert.assertEquals(number4,Addition.Add2numbers());
 		System.out.println("Addition of 2 numbers is ");
	        }
	}


