package di6.java;

import org.springframework.stereotype.Component;

@Component("kumho")
public class kumhoTire implements Tire {

	public String getBrand() {
		// TODO Auto-generated method stub
		return "금호타이어";
	}
	
}
