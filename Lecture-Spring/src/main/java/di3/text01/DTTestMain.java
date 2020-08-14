package di3.text01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DTTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//생성자 주입
		Calculator c = new Calculator();
		MyCalculator my = new MyCalculator(c);
		*/
		ApplicationContext container = new GenericXmlApplicationContext("di3/test01/beanContainer.xml");
		
		MyCalculator my = (MyCalculator)container.getBean("myCal");
		
		my.setFirstNum(15); 
		my.setSecondNum(4);
		 
		
		my.add();
		my.sub();
		my.div();

	}

}
