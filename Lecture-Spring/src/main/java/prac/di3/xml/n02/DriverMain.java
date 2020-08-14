package prac.di3.xml.n02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Tire tire = new HankookTire();
//		Car car = new Car(tire);
//		car.prnTireBrand(); 
		
		ApplicationContext context = new GenericXmlApplicationContext("prac_di3-xml02.xml");
		
		Car car = (Car)context.getBean("car");
		car.prnTireBrand();
	}

}
