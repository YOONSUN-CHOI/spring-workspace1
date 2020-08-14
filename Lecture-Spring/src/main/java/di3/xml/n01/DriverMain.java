package di3.xml.n01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

//스프링을 통한 속성 주입방식
public class DriverMain {

	public static void main(String[] args) {
		
		
		/*
		 * Tire tire = new HankookTier();
		 * 
		 * Car car = new Car();
		 * 
		 * 
		 * car.setTire(tire); // 속성주입
		 * 
		 * car.prnTireBrand();
		 */
		
		
		
		
		/*
		 * ApplicationContext context = new
		 * GenericXmlApplicationContext("di-xml01.xml"); Car car =
		 * (Car)context.getBean("car"); Tire tire = (Tire)context.getBean("tire");
		 * car.setTire(tire); car.prnTireBrand();
		 */
		
		
		//방법2
		ApplicationContext context = new GenericXmlApplicationContext("di-xml01.xml");
		Car car = (Car)context.getBean("car2");
		car.prnTireBrand();
	}

}
