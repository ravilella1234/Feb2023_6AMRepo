package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PaymentManagement 
{
  @Test
  public void applyDiscount() 
  {
	  System.out.println("----  applyDiscount  -----");
  }
  
  @Test
  @Parameters({"action"})
  public void makePayment(String parameterType,ITestContext context) 
  {
	  if(parameterType.equals("pay@online"))
		  System.out.println("----  makePayment @online  -----");
	  else
		  System.out.println("----  makePayment @Hotel  ------");
	  
	  //Booking ID
	  String  bookingID = "RRR1234";
	  System.out.println("BID : " + bookingID);
	  context.setAttribute("bID", bookingID);
  }
}
