package prac.basic1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class HelloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context = new GenericXmlApplicationContext("prac_beanContainer.xml");
		
		Hello obj = (Hello)context.getBean("hello");
		obj.printmsg();
		
		Hello obj2 = (Hello)context.getBean("hello2");
		obj2.printmsg();
		
		prac.basic1.HelloSingle obj3 = context.getBean("hs", HelloSingle.class);
		obj3.prnMsg();
		/* HelloSingle.class는 (HelloSingle)방식 대신 형변환 하는 방법 */
		
		HelloSingle obj4 = context.getBean("hs2", HelloSingle.class);
		obj4.prnMsg();
	}

}
