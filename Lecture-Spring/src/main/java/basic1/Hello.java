package basic1;

public class Hello {
	private String msg;
	
	public Hello() {
		System.out.println("Hello 객체 로딩...");
		msg="Hello";
	}
	
	public void prnMsg() {
		System.out.println("msg : "+msg);
	}
}
