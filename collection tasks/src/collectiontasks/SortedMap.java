package collectiontasks;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortedMap {

	public static void main(String[] ags) {

		Map<String,String> map = new HashMap<>();
		map.put("Maharashtra","Mumbai");
		map.put("Rajasthan","Jaipur");
		map.put("Karnataka","Bangalore");
		map.put("Telengana","Hyderabad");			
		
		for(Map.Entry<String, String> i:map.entrySet()) {
			System.out.println(i.getKey()+"->"+i.getValue());
		}
		
//		System.out.println("\n Sorted based on Key");
//		Map<String,String> map1 = getSortedMapBasedOnKey(map);
//		for(Map.Entry<String, String> i:map1.entrySet()) {
//			System.out.println(i.getKey()+"->"+i.getValue());
//		}
//		System.out.println("\n Sorted based on Value");
//		Map<String,String>map2 = getSortedMapBasedOnValue(map);
//		for(Map.Entry<String, String> i:map2.entrySet()) {
//		System.out.println(i.getKey()+"->"+i.getValue());
//		}
		
		System.out.println("\n sorting using treeMap based on keySet");
		Map<String, String> treeMap = new TreeMap<>(map);
		for(Map.Entry<String, String> i : treeMap.entrySet()) {
			System.out.println(i.getKey()+" -> "+i.getValue());
		}
		
		
		
		
		
	}
	
	public static Map<String,String> getSortedMapBasedOnValue(Map<String, String> hashMap) {
		//Converting hashMap to List, and argument type is key-value pair(Map.Entry(T,T)).
		List<Map.Entry<String,String>> list = new LinkedList<Map.Entry<String,String>>(hashMap.entrySet());
		//Using Collections.sort to sort entries based on values.
		Collections.sort(list,(l1,l2) -> l1.getValue().compareTo(l2.getValue()));
		//Create an empty LinkedHashMap to store sorted Map values(LinkedHashMap maintains insertion order).
		Map<String, String> outputMap = new LinkedHashMap<String,String>();
		//Add each entries of list to LinkedHashMap.
		for(Map.Entry<String,String> i: list) {
			outputMap.put(i.getKey(),i.getValue());
		}
		return outputMap;
	}
	
	public static Map<String,String> getSortedMapBasedOnKey(Map<String, String> hashMap) {
		List<Map.Entry<String,String>> list = new LinkedList<>(hashMap.entrySet());
		Collections.sort(list,(l1,l2) -> l1.getKey().compareTo(l2.getKey()));
		
		Map<String, String> outputMap = new LinkedHashMap<String,String>();
		for(Map.Entry<String,String> i: list) {
			outputMap.put(i.getKey(),i.getValue());
		}
		return outputMap;
	}
	

	
	
	
}

