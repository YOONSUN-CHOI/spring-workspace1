package di4.anno.n03;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	//@Resource(name = "kumho")
	@Resource
	private Tire tire;     //의존관계 발생
	
	public Car() {
		System.out.println("Car 기본 생성자 호출... ");
	}
	
	
	//생성자 주입
	
	public Car(@Qualifier("kumho") Tire tire) {    /* @Qualifier를 파라미터에 쓴다. */
		this.tire = tire;
		System.out.println("Car(Tire)호출... 생성자 주입");
	}
	
	// 속성주입(Setter 주입)
	//@Resource
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire(Tire) 호출... 속성주입");
	}
	
	public void prnTireBrand() {
		System.out.println("장착된 타이어 : "+tire.getBrand());
	}
}
