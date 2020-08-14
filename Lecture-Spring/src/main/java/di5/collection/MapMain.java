package di5.collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext container = new GenericXmlApplicationContext("di5/collection/collection2.xml");
		MapAddress map = (MapAddress)container.getBean("map");
		
		Map<String,String> addrs = map.getAddress();
		Set<Entry<String,String>> address = addrs.entrySet();

		for(Entry<String,String> a : address) {
			System.out.println(a.getKey()+" : "+a.getValue());
		}
		

	}

}
