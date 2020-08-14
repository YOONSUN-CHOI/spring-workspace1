package prac.di3.xml.n02;



public class Car {
	
	private Tire tire;     //의존관계 발생	
	
	public Car() {
		System.out.println("Car 기본 생성자  호출...");
	}

	public void prnTireBrand() {
		System.out.println("장착된 타이어 : "+tire.getBrand());
	}

	// 속성주입(Setter 주입)
	public void setTire(Tire tire) {
		System.out.println("setter 속성 주입");
		this.tire = tire;
	}
	
	//이거가 여기서부터 만든거임  속성주입(Setter 주입)
	public Car(Tire tire) {
		System.out.println("Car(Tire) 생성자 호출...");
		this.tire = tire;
	}
	
	public Car(Tire tire01, Tire tire02) {
		System.out.println("Car(Tire,Tire) 생성자 호출...");
		System.out.println(tire01.getBrand()+" , "+tire02.getBrand());	
	}
	
	public Car(Tire tire01, String msg) {
		System.out.println("Car(Tire,String) 생성자 호출...");
		System.out.println(tire01.getBrand()+" , "+msg);	
	}

	
}
