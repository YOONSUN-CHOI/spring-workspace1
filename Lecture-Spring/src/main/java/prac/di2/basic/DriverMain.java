package prac.di2.basic;



public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tire tire = new HankookTire();
		
		//Car car = new Car(tire); // 생성자 주입코드
		
		Car car = new Car();
		car.setTire(tire);
		car.prnTireBrand();
	}

}
