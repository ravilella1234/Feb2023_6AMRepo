package icici.loans.homeloans;

public class UserDefineArray 
{

	public static void main(String[] args) 
	{
		Student s1 = new Student(100,"s1");
		Student s2 = new Student(200,"s2");
		Student s3 = new Student(300,"s3");
		Student s4 = new Student(400,"s4");
		
		
		//System.out.println(s1 +"\n"+s2 +"\n"+s3 +"\n" + s4);
		
		Student[] st = new Student[4];
		st[0]=s1;
		st[1]=s2;
		st[2]=s3;
		st[3]=s4;
		
		for(Student s:st)
		{
			System.out.println(s);
		}
		
	}

}
