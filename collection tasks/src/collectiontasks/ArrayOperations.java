package collectiontasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayOperations {

	public static void main(String[] args) {
		
		ArrayList<String> arraylist = new ArrayList<>();
		Collections.addAll(arraylist,"cat","dog","lion","fox","ant");
		System.out.println("Arraylist: "+arraylist);
		
// Iterate ArrayList using Java ListIterator	
		System.out.println("using Iterator");
		Iterator<String> i = arraylist.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
// Arraylist add element at specific index		
		arraylist.add(3,"added");
		
// Sort ArrayList in descending order
		Collections.sort(arraylist,Collections.reverseOrder());
		System.out.println("Sorted arrayList: "+arraylist);
		
// insert an element to ArrayList using ListIterator	
		ListIterator<String> x = arraylist.listIterator();
		x.add("tiger");
		while (x.hasNext()) {
			x.next();
		}x.add("rabbit");
		System.out.println("after adding through ListIterator: "+arraylist);
		
		
// sort arraylist of strings alphabetically java
		arraylist.sort(null);
      //Collections.sort(arraylist);
		System.out.println("sorted alphabetically: "+arraylist);

//replace an element at specified index arraylist		
		arraylist.set(0, "replaced");

// Search an element of Java ArrayList		
		System.out.println("contains added: "+arraylist.contains("added"));
		
// Remove element from specified index ArrayList
		System.out.println("removed element at index '2': "+arraylist.remove(2));
		
		System.out.println("\n final arraylist");
	    for(String a:arraylist) {
	    	System.out.println(a);
	    }
		
	}

}
