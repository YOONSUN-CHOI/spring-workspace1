package di5.collection;

import java.util.ArrayList;
import java.util.List;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ListMain {
	
	public static void main(String[] args) {
		
		ApplicationContext container = new GenericXmlApplicationContext("di5/collection/collection01.xml");
		ListAddress list = container.getBean("list", ListAddress.class);
		ListAddress list02 = container.getBean("list02", ListAddress.class);
		
		
		for(String addr : list.getAddress()) {
			System.out.println(addr);
		}
		System.out.println("=========================");
		for(String addr : list02.getAddress()) {
			System.out.println(addr);
		}
	}

	
}
