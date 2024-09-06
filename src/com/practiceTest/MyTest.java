package com.practiceTest;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.practice.MyException;
import com.practice.Demo;

public class MyTest {

	Scanner obj=new Scanner(System.in);
	Demo d=null;
	public void show()
	{
		int n1=0;
		int n2=0;
		try {
			d=new Demo();
			System.out.println("Enter first number : ");
			n1=obj.nextInt();
			System.out.println("Enter second number : ");
			n2=obj.nextInt();
			if(n2==0)
			{
				throw new MyException("you can't enter this number..");
			}
			int result=d.divide(n1, n2);
			System.out.println("\n"+result);
		}
		catch(MyException e)
			{
				System.out.println(e);
			}
		catch(InputMismatchException e)
			{
				System.out.println("Enter Numeric Value...");
				
			}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		}
	
	public static void main(String[] args) {
		
		MyTest  mt=new MyTest();
		mt.show();
	}
	

}
