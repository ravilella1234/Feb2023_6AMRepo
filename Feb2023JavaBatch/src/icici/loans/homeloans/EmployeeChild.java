package icici.loans.homeloans;

public class EmployeeChild extends Employee
{
	String city;
	
	public EmployeeChild(String city) 
	{
		super(2000,"kiran",12.344f);
		this.city = city;
		
		System.out.println(this.city);
	}
	
	void m4()
	{
		
	}

	public static void main(String[] args)
	{
		EmployeeChild ec = new EmployeeChild("Hyderabad");
	}

}
