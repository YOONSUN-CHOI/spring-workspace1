package prac.di3.xml.n01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		 Tire tire = new HankookTier();
//		 Car car = new Car();  
//		 car.setTire(tire); // 속성주입 
//		 car.prnTireBrand();
		
		
		//방법1
//		ApplicationContext context = new  GenericXmlApplicationContext("prac_di3-xml01.xml");
//		Car car = (Car)context.getBean("car");
//		Tire tire = (Tire)context.getBean("tire");
//		car.setTire(tire);
//		car.prnTireBrand();
		
		
		//방법2
		ApplicationContext context = new  GenericXmlApplicationContext("prac_di3-xml01.xml");
		Car car = (Car)context.getBean("car2");
		car.prnTireBrand();
		

	}

}
