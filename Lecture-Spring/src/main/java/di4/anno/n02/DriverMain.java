package di4.anno.n02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("di-anno2.xml");
		// 요기까지 작성 후 실행하면 기본생성자만 호출
		// 속성 주입이 없었기 때문에 car의 tire은 null 값
		
		Car car = context.getBean("car", Car.class);
		car.prnTireBrand();  // annotation없으면 null pointer exception error!!, 있으면 알아서 넣어줌

	}
	
}
