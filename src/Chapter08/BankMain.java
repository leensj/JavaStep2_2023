package Chapter08;

import java.util.Scanner;



public class BankMain {

	public static void main(String[] args) {
		//방법1
		/*
		Bank bk1 = new Bank("강남", "010-1111-1111");
		//bk1.interest=0.2f
		Bank.interest=0.2f;
		bk1.getBank();
		
		System.out.println("===============");
		Bank bk2 =new Bank("신한", "010-42131-11211");
		bk2.getBank();
		*/
		//방법2
	    String point=null;
	    String tel=null;
	    Scanner scan=new Scanner(System.in);
	    
	  
	    		
	    Bank bank=new Bank(point, tel);
	    
	    System.out.println(point +" 지점의 이자를 입력하세요.");
	    Bank.interest=scan.nextFloat();
	    
	    bank.getBank();
	    
	}//main

}//class
