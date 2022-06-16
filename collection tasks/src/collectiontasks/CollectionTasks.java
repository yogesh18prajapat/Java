package collectiontasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionTasks {

	public static void main(String[] args) {
		
// convert LinkedList to ArrayList		
		LinkedList<Integer> linkedList = new LinkedList<>();
		Collections.addAll(linkedList, 5,8,3,7,1,9,5,4,6);
		
		ArrayList<Integer> arrayList = new ArrayList<>(linkedList);
		arrayList.add(0);
		
// convert HashSet to Array
		Set<String> set = new HashSet<>();
		Collections.addAll(set,"cat","dog","lion","fox","ant","dog","lion");
		System.out.println(set);
		
        //String[] arr =set.toArray(new String[set.size()]);
		String[] array =new String[set.size()];
		set.toArray(array);
		System.out.println(Arrays.toString(array));
		array[1] = "added";	
		System.out.println(Arrays.toString(array));
		System.out.println(array[3]);
		System.out.println(array.length);
		
		System.out.println("Original: "+arrayList);
		Collections.reverse(arrayList);
		System.out.println("after reversing an arraylist: "+arrayList);
		
// synchronize a HashMap in java
        Map<String,String> map = new HashMap<>();
        map.put("Maharashtra","Mumbai");
        map.put("Rajasthan","Jaipur");
        map.put("Karnataka","Bangalore");
        map.put("Telengana","Hyderabad");

        for(Map.Entry<String, String> i:map.entrySet()) {
            System.out.println(i.getKey()+"->"+i.getValue());
        }

		Map<String,String> syncMap = Collections.synchronizedMap(map);
		

// synchronize an ArrayList in java		
		List<Integer> syncArrayList = Collections.synchronizedList(arrayList);

	}
	
	
}		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

