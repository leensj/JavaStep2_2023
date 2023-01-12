package Chapter08;

public class StudentMain {

	
	public static void main(String[] args) {
		
		 Student1 studentLee=new  Student1();
		 studentLee.setStudentName("이재민");
		 System.out.println(studentLee.StudentName);
		 //System.out.println(studentLee.getSeriaLNum());
		 System.out.println(Student1.getSeriaLNum());
         Student1.seriaLNum++; //10001
		 
		 
		 System.out.println();
		 Student1 studentkim=new  Student1();
		 studentLee.setStudentName("김창우");
		 System.out.println(studentkim.StudentName);
		 System.out.println(studentkim.getSeriaLNum());		
		 Student1.seriaLNum++; //10002
		 
		 System.out.println();
		 Student1 studentpark=new  Student1();
		 studentLee.setStudentName("박창훈");
		 System.out.println(studentpark.StudentName);
		 System.out.println(studentpark.getSeriaLNum());		
		 Student1.seriaLNum++; //10003
		 
		 
		 
	}//main

}//class
