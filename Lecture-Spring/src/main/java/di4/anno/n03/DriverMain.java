package di4.anno.n03;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("di-anno3.xml");
		
		
		Car car = context.getBean("car", Car.class);
		car.prnTireBrand();  // annotation없으면 null pointer exception error!!, 있으면 알아서 넣어줌

		
		
		/*
		 * Autowired 순서는 타입 - 이름
		 * @Resource는 순서가 이름 - 타입매칭 
		 * */
	}
	
}
