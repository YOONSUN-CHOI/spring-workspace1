package prac.calc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new GenericXmlApplicationContext("myCalc.xml");
		
		MyCalculator mc = (MyCalculator)context.getBean("calc");
		mc.prnCalcResult();
		

	}

}
