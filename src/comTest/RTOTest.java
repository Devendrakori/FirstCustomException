package comTest;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.Sept05.AgeTooHighException;
import com.Sept05.AgeTooLowException;

public class RTOTest {
	Scanner obj=new Scanner(System.in);
	public void checkAge()
	{
		System.out.print("Enter your age : ");
		int age=0;
		try {
			 age=obj.nextInt();
			 if(age<18)
				{
					try {
					throw new AgeTooLowException("Your age is below than 18.");
					}
					catch(AgeTooLowException e)
					{
						System.out.println(e);
					}
				}
				else if(age>60)
				{
					try {
					throw new AgeTooHighException("Your age is greater than 70.");
					}
					catch(AgeTooHighException e)
					{
						System.out.println(e);
					}
				
					}
				else
					System.out.println("You are eligible for driving licence.");	
		}
		
		catch(InputMismatchException e)
		{
			System.out.println("Enter Numeric Value...");
			
		}
		
			
	}
	public static void main(String[] args) {
		
		RTOTest rt=new RTOTest();
		rt.checkAge();
	}

}
