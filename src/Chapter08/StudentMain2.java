package Chapter08;

public class StudentMain2 {

	
	public static void main(String[] args) {
		
		 Student1 studentLee=new  Student1();
		 studentLee.setStudentName("이재민");
		 studentLee.studentID=studentLee.seriaLNum;
		 System.out.println("이름 : " + studentLee.StudentName+ " | 아이디 : "+ studentLee.StudentName);
		 
		 
		
		 Student1 studentkim=new  Student1();
		 studentLee.setStudentName("김창우");
		 System.out.println(studentkim.StudentName);
		 System.out.println("이름 : " + studentkim.StudentName+ " | 아이디 : "+ studentkim.StudentName);

		
		 Student1 studentpark=new  Student1();
		 studentLee.setStudentName("박창훈");
		 System.out.println(studentpark.StudentName);
		 System.out.println("이름 : " + studentpark.StudentName+ " | 아이디 : "+ studentpark.StudentName);
	
		 
		 
		 
	}//main

}//class
