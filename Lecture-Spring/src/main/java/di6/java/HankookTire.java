package di6.java;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("hankook")
public class HankookTire implements Tire {
	
	public HankookTire() {
		System.out.println("한국타이어 생성자 호출...");
	}

	public String getBrand() {
		// TODO Auto-generated method stub
		return "한국타이어";
	}
	
}
