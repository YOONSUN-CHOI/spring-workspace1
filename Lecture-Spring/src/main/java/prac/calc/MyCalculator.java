package prac.calc;

import prac.di3.xml.n02.Tire;

public class MyCalculator {
	private Calculator calculator;
	private int firstNum;
	private int secondNum;
	
	public MyCalculator() {
		System.out.println("MyCalculator의 기본 생성자 호출..");
	}
	
	public void prnCalcResult() {
		System.out.println("결과 : "+calculator.getCalcResult());
	}
	
	public MyCalculator(Calculator calculator) {
		System.out.println("MyCalculator(Calculator) 생성자 호출...");
		this.calculator = calculator;
	}
	
	public MyCalculator(Calculator calculator01, Calculator calculator02) {
		System.out.println("MyCalculator(Calculator,calculator) 생성자 호출...");
		System.out.println(calculator01.getCalcResult()+" , "+calculator02.getCalcResult());
		//this.calculator = calculator;
	}
	
}
