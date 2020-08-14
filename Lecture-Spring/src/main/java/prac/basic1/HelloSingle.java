package prac.basic1;


public class HelloSingle {
	private String msg="안녕 난 싱글턴이야..";
	
	private static HelloSingle instance = null;
	
	private HelloSingle() {
		System.out.println("HelloSingle의 기본 생성자 호출..");
	}
	
	public static HelloSingle getInstance() {
		if(instance == null)
			instance = new HelloSingle();
		return instance;
	}
	
	public void prnMsg() {
		System.out.println("msg : "+msg);
	}
}
