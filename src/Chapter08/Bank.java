package Chapter08;

public class Bank {

	private String point;
	private String tel;
	static float interest;
	
	public Bank(String point,String tel) {
		this.point=point;
		this.tel=tel;
	}
	
	//결과룰 출력할 메소드
    public void getBank() {
    	System.out.println("지점 : "+point+"\n"+ "전화번호 : "+ tel+ "\n"+"은행이자 : "+interest);
    }
	
	
}
