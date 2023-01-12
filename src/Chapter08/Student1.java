package Chapter08;

public class Student1 {

	 public static int seriaLNum=10000;
	 int studentID;
	 String StudentName;
	 int grade;
	 String address;
	 
	 
	public static int getSeriaLNum() {
		return seriaLNum;
	}
	public static void setSeriaLNum(int seriaLNum) {
		Student1.seriaLNum = seriaLNum;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	 
	 
	 
}
