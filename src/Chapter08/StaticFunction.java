package Chapter08;

public class StaticFunction {

	String str1="일반 회원변수";
	static String str2="static 회원변수";
	
	public static String getStatic() {
		
	    //static 메소드는 static 변수만 사용이 가능하다.
		//str1="VIP";
		
		return "0";
	}
	
}//class
