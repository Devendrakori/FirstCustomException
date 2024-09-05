package comTest;
import com.Sept05.*;
public class TestGpay {
	
	public static void main(String[] args) {
		Gpay g=new SBI();
		try {
			g.show();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
	}
	

}
