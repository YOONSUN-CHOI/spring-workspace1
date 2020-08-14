package prac.di4.anno.n01;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;



public class Car {
	//@Autowired    변수. 생성자 가능한듯
	//@Resource
	private Tire tire;
	
	//@Autowired
	public Car() {
		System.out.println("Car 기본생성자 호출");
		System.out.println(" @Autowired을 붙이지 않는다면 car의 tire은 null값. 붙이면 자동 주입.");
	}
	
	//@Autowired
	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("Car(Tire)호출... 생성자 주입");
	}
	
	@Resource
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire(Tire) 호출... 속성주입");
	}
	
	
	
	public void prnTireBrand() {
		System.out.println("장착된 타이어 : "+tire.getBrand());
	}

}
