package di4.anno.n01;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	
	//@Autowired  /* = new HankookTire(); 이러한 효과가! */
	@Resource /* resource는 변수(field)와 메소드만 가능! 생성자 앙댐 */
	private Tire tire;     //의존관계 발생
	
	public Car() {
		System.out.println("Car 기본 생성자 호출... @Autowired을 붙이지 않는다면 car의 tire은 null 값 붙이면 자동으로 주입");
	}
	
	
	//생성자 주입
	//@Autowired
	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("Car(Tire)호출... 생성자 주입");
	}
	
	// 속성주입(Setter 주입)
	//@Autowired /* 자동으로 속성주입 하는 annotation */
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire(Tire) 호출... 속성주입");
	}
	
	public void prnTireBrand() {
		System.out.println("장착된 타이어 : "+tire.getBrand());
	}
}
