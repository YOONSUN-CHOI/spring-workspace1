package basic1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import di2.basic.HelloSingle;

public class HelloMain {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("beanContainer.xml");
		//ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/beanContainer.xml");
		//ApplicationContext context = new GenericXmlApplicationContext("classpath:beanContainer.xml");
		
		
		ApplicationContext context = new GenericXmlApplicationContext("beanContainer.xml");
		//GenericXmlApplicationContext는 클래스 패스뿐아니라 다양한 소스로부터 설정파일을 읽어올수 있다.
		
		Hello obj = (Hello)context.getBean("hello");  // 오브젝트형으로 반환해서 형변환하기
		obj.prnMsg();
		
		Hello obj2 = (Hello)context.getBean("hello2");  // 오브젝트형으로 반환해서 형변환하기
		obj2.prnMsg();
		
		
		HelloSingle obj3 = context.getBean("hs", HelloSingle.class); 
		obj3.prnMsg();
		
		HelloSingle obj4 = context.getBean("hs2" , HelloSingle.class);  //형변환하는 다른 방법 
		obj4.prnMsg();
	}
}
