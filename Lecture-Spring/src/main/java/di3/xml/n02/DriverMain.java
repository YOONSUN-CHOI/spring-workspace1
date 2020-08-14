package di3.xml.n02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

//XML을 이용한 SPRING 생성자 주입방식
public class DriverMain {

	public static void main(String[] args) {
		
		
		/*
		Tire tire = new HankookTire();
		Car car = new Car(tire);
		car.prnTireBrand();  
		*/
		
		
		ApplicationContext context = new GenericXmlApplicationContext("di-xml02.xml");
		
		Car car = (Car)context.getBean("car");
		car.prnTireBrand();
		
		
		
		
		
		
	}

}
