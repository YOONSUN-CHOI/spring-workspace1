package di3.text03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import di3.text03.Calculator;

@Component
public class MyCalculator {
	
	//@Autowired
	private  Calculator calculator;
	
	//@Value("15")
	private int firstNum;
	
	//@Value("4")
	private int secondNum;
	
	public MyCalculator() {
	
	}
	
	public MyCalculator(Calculator calculator) {
		this.calculator=calculator;
	}
	
	
	@Autowired
	public MyCalculator(@Value("15")int firstNum, @Value("4")int secondNum, Calculator calculator) {
		super();
		this.calculator = calculator;
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	

	public void add() {
		calculator.addition(firstNum,secondNum);
	}
	
	public void sub() {
		calculator.substration(firstNum,secondNum);
	}
	
	public void div() {
		calculator.division(firstNum,secondNum);
	}

}
