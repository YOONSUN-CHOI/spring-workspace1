package di3.xml.n01;

public class Car {
	private Tire tire;     //의존관계 발생	
	
	
	
	public void prnTireBrand() {
		System.out.println("장착된 타이어 : "+tire.getBrand());
	}
	
	
	// 속성주입(Setter 주입)
	public void setTire(Tire tire) {
		this.tire = tire;
	}
}
