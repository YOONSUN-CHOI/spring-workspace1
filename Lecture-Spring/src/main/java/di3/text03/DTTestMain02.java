package di3.text03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DTTestMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext container = new GenericXmlApplicationContext("di3/test01/beanContainer2.xml");
		MyCalculator my = container.getBean("myCal",MyCalculator.class);
		
		//MyCalculator my = new MyCalculator(15,4, new Calculator());
		
		my.add();
		my.sub();
		my.div();
		
	}

}
