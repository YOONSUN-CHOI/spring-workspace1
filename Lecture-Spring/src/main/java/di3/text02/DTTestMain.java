package di3.text02;

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
		ApplicationContext container = new GenericXmlApplicationContext("di3/test02/beanContainer.xml");
		
		MyCalculator my = (MyCalculator)container.getBean("mycalculator");
		 
		
		my.add();
		my.sub();
		my.div();

	}

}
