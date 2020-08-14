package prac.basic1;

public class Hello {
	private String msg;
	
	public Hello() {
		System.out.println("Hello의 기본 생성자 호출...");
		msg="Hello";
	}
	
	public void printmsg() {
		System.out.println("msg : "+ msg);
	}
}
