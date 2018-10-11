import java.util.ArrayList;
import java.util.Collections;

public class arraysorting {
	 public static void main(String args[]) {
		 
//    ArrayList<Integer> alist=new ArrayList<Integer>();  
//    alist.add(1);
//    alist.add(7);
//    alist.add(3);
//    alist.add(9);
//    alist.add(1);
//    alist.add(6);
//    System.out.println("befoe Storing");
//		 Adding between ttwo arraylist 
//	     al.addAll(al2);
		 
//		 Inside the index
//		  al.addAll(2, al2);
//    for(Integer obj : alist) {
//    		System.out.println(obj);
//    }
//    Collections.sort(alist);
//    
//    System.out.println("befoe Storing");
//    for(Integer obj : alist) {
//    		System.out.println(obj);
//    }
		 

//		 Compare betwen two array list
//	     ArrayList<String> al3= new ArrayList<String>();
//         for (String temp : al1)
//             al3.add(al2.contains(temp) ? "Yes" : "No");
//         System.out.println(al3);	 
//		 
		 
		 ArrayList<String> alist=new ArrayList<String>();  
	    alist.add("local");
	    alist.add("money");
	    alist.add("lucky");
	    alist.add("Digital");
	    alist.add("Dragon");
	    alist.add("Mental");
	    System.out.println("befoe Storing");
	    for(String obj : alist) {
	    		System.out.println(obj);
	    }
//	    Collections.sort(alist);
		Collections.sort(alist, Collections.reverseOrder());
	    
	    System.out.println("befoe Storing");
	    for(String obj : alist) {
	    		System.out.println(obj);
	    }
		 
	 }
	
}
