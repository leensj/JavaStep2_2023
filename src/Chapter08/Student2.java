package Chapter08;

public class Student2 {

	 public static int seriaLNum=9999;
	 int studentID;
	 String StudentName;
	 int grade;
	 String address;
	 
	 public Student2() {
		 //후위연산
		    seriaLNum++;
			this.studentID=seriaLNum;
		   //전위연산
		   //
		}
	 
	 
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public static int getSeriaLNum() {
		return seriaLNum;
	}
	
	 
	
}//class
