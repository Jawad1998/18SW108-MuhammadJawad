class Result{ 
public static void main(String[] args) {
	

	
		Student s1 = new Student();
		s1.setDetails("18SW108","Muhammad Jawad","Software",20);
		Marksheet m1 = new Marksheet(70,85,80);
		Combine c= new Combine(s1,m1);
		c.printDetails();





	}
	}
