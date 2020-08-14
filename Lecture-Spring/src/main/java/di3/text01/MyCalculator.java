package di3.text01;

import di3.text01.Calculator;

public class MyCalculator {
	private  Calculator calculator;
	private int firstNum;
	private int secondNum;
	
	public MyCalculator() {
	
	}
	
	public MyCalculator(Calculator calculator) {
		this.calculator=calculator;
	}
	
	

	public MyCalculator(int firstNum, int secondNum, Calculator calculator) {
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
