package di6.java;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages = {"di6.java"})
@Configuration   /* xml파일에서 <bean> 대신 사용하는 것임 이 행위를 자바로 하고 싶다. */
public class Config {
	
	@Bean
	public Tire hankookTire() {  //메소드 이름이 중요한것이 아니라 return 부분에서  new HankookTire()  해주는 것이 훨씬 중요하다.
		return new HankookTire();
	}
	
	@Bean(name = "kumho")
	public Tire kumhoTire() { 
		return new kumhoTire();
	}
	
	@Bean
	public Car car() {
		return new Car();
	}
	
}
