package di4.anno.n02;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	//@Autowired(required = false) /* required 무조건 의존주입 아냐!! 없으면 주입하지마~ */
	//@Qualifier("kumho")
	private Tire tire;     //의존관계 발생
	
	public Car() {
		System.out.println("Car 기본 생성자 호출... @Autowired을 붙이지 않는다면 car의 tire은 null 값 붙이면 자동으로 주입");
	}
	
	
	//생성자 주입
	@Autowired
	public Car(@Qualifier("kumho") Tire tire) {    /* @Qualifier를 파라미터에 쓴다. */
		this.tire = tire;
		System.out.println("Car(Tire)호출... 생성자 주입");
	}
	
	// 속성주입(Setter 주입)
	//@Autowired
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire(Tire) 호출... 속성주입");
	}
	
	public void prnTireBrand() {
		System.out.println("장착된 타이어 : "+tire.getBrand());
	}
}
