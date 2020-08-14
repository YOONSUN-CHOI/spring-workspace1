package prac.di2.basic;

public class Car {
	private Tire tire;
	
	public Car() {
		System.out.println("Car의 기본 생성자 호출...");
	}
	
	//생성자 주입
	public Car(Tire tire) {
		System.out.println("Car의 생성자 주입 방식 호출...");
		this.tire = tire;
	}
	
	//속성주입
	public void setTire(Tire tire) {
		System.out.println("Car의 속성 주입 방식 호출...");
		this.tire = tire;
	}
	
	public void prnTireBrand() {
		System.out.println("장착된 타이어 : "+tire.getbrand());
	}
}
