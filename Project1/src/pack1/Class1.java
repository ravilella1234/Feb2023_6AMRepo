package pack1;

public class Class1 
{
	int a,b,result;
	
	public Class1(int a, int b) 
	{
		super();
		this.a = a;
		this.b = b;
	}

	public void add()
	{
		result = a+b;
		System.out.println("Add of A & B is : " +  result);
	}
	
	public void sub()
	{
		result = a-b;
		System.out.println("Sub of A & B is : " +  result);
	}
	
	public static void main(String[] args) 
	{
		Class1 obj1 = new Class1(100, 200);
		obj1.add();
		obj1.sub();
	}

}
