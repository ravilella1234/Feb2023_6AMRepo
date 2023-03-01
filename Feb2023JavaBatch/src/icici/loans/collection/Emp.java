package icici.loans.collection;

public class Emp 
{
	int eno; 
	String ename;
	
	public Emp(int eno, String ename) 
	{
		super();
		this.eno = eno;
		this.ename = ename;
	}
	
	@Override
	public String toString() {
		return "Emp [eno=" + eno + ", ename=" + ename + "]";
	}

	public static void main(String[] args) 
	{
		Emp e = new Emp(1744, "sai");
		System.out.println(e);
	}
}
