package collectiontasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesArraylist {

	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<>();
		Collections.addAll(arraylist,"cat","lion","fox","dog","lion","fox","ant","cat");
		System.out.println("Original Arraylist: "+arraylist);
		
//		ArrayList<String> list = new ArrayList<>();
//		for(String i:arraylist) {
//			if(!list.contains(i)) {
//				list.add(i);
//			}
//		}
//		System.out.println("After removing Duplicates: "+list);
			
		
		System.out.println("after removing duplicates:  "+removeDuplicates(arraylist));
		System.out.println("using sets: "+collectionsRemoveDuplicates(arraylist));
	
		
//Removing duplicates of an arraylist.		
		ArrayList<Integer> arraylist2 = new ArrayList<>();
		Collections.addAll(arraylist2,1,9,8,3,6,4,6,5,7,9,7,7);
		System.out.println(arraylist2);
		System.out.println(removeDuplicates(arraylist2));
	
		
int[] array = new int[] {5,4,8,6,1,8,4,7,3,4,7};
System.out.println("array: "+Arrays.toString(array));
removeArrayDuplicates(array);	
		
		
		
	}
	
	
	
	
	
	public static ArrayList removeDuplicates(ArrayList list ) {
		ArrayList x = new ArrayList<>();
		for(Object i:list) {
			if(!x.contains(i)) {
				x.add(i);
			}
		}
		return x;
	}
	
	public static ArrayList collectionsRemoveDuplicates(ArrayList list ) {
		Set set = new HashSet<>(list);
		return new ArrayList<>(set);
	}
	
	public static void removeArrayDuplicates(int[] array) {


		
		
		
		
	}

}
