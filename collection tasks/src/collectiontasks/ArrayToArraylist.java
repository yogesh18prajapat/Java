package collectiontasks;

import java.util.*;

public class ArrayToArraylist {
	public static void main(String[] ags) {
		
		ArrayList<String> arraylist = new ArrayList<>();
		Collections.addAll(arraylist,"one","two","three","four","five");
		System.out.println("Arraylist: "+arraylist);
		
//ArrayList to Array Using toArray() method.	
		Object[] array = arraylist.toArray();
		System.out.println("Array: "+Arrays.toString(array));
		
//array to ArrayList using Collections.
		ArrayList<Object> arraylist1 = new ArrayList<Object>();
		Collections.addAll(arraylist1,array);
		System.out.println("Arraylist1: "+arraylist1.toString());

//arrayList to array using for-loop.
		String[] array1 = new String[arraylist1.size()];
		for(int i = 0; i<arraylist1.size(); i++) {
			array1[i] = arraylist.get(i);
		}
		System.out.println("array1: "+Arrays.toString(array1));
				
//array to arrayList using for-each-loop.
		ArrayList<Object> arraylist2 = new ArrayList<Object>();
		for(Object i : array) {
			arraylist2.add(i);
		}
		System.out.println("Arraylist2: "+arraylist2.toString());
		
//arrayList to array		
		Object[] array3 = new Object[]{arraylist2};
		System.out.println("array3: "+Arrays.toString(array3));

//array to arrayList using Arrays.asList() method
		ArrayList arraylist3 =new ArrayList<>( Arrays.asList(array3));
		arraylist3.add("added");
		System.out.println("Arraylist3: "+arraylist3);

	}
		

}
