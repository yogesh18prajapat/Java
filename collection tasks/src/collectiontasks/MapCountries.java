package collectiontasks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


public class MapCountries {

	public static void main(String[] ags) {
		Map<String,String> map = new HashMap<>();
		map.put("India","New Delhi");
		map.put("Pakistan","Islamabad");
		map.put("Japan","Tokyo");
		map.put("China","Beijin");
		map.put("Srilanka","Colombo");
		map.put("Bangladesh","Dhaka");
		
		TreeMap<String, String> treeMap = new TreeMap<>(map);
		
// keySet using forEach-loop
		System.out.println("\n Iterating keySet using forEach-loop");
		for(String i: map.keySet()) {
			System.out.println(i);
		}
				
// entrySet using forEach-loop
		System.out.println("\n Iterating using forEach-loop");
		for(Map.Entry<String,String> i : map.entrySet()) {
			System.out.println(i.getKey()+" -> "+i.getValue());
		}


//entrySet with Iterator
		System.out.println("\n entrySet with Iterator");
		Iterator itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//using keySet iterator
		System.out.println("\n using keySet iterator");
		Iterator i = map.keySet().iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
//Iterating keySet using forEach-loop
		System.out.println("\n Iterating keySet using forEach-loop");
			for(String x: treeMap.keySet()) {
			System.out.println(x);
		}
		
		
		
	}
	
	
}
