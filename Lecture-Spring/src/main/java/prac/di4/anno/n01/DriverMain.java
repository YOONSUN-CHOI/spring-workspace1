package prac.di4.anno.n01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new GenericXmlApplicationContext("prac_di4-anno01.xml");
		
		Car car = context.getBean("car", Car.class);
		car.prnTireBrand();

	}

}
