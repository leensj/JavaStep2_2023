package Chapter08;

public class CompanyMain {

	public static void main(String[] args) {
		// heap (일반적인 객체 생성)
	
		Company company1=new Company();
		Company company2=new Company();
		
		System.out.println(company1);
		System.out.println(company2);
		
		System.out.println("0---------------singleton");
		//Date
		Company mycompany1=Company.getinstance();
		Company mycompany2=Company.getinstance();
		
		System.out.println(mycompany1);
		System.out.println(mycompany2);
		System.out.println(mycompany1==mycompany2);
		
	}//main

}//class
