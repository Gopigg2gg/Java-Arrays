import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistIntialize {
	
	public static void main (String args[]) {
//		ArrayList<String>  inti = new ArrayList<String>(Arrays.asList ("LOCAL", "KOKIL","Harsh" ));
		ArrayList<String>  inti = new ArrayList<String>() {{ add("LOCAL"); add("money");}};
//	     ArrayList<String> al2 = (ArrayList<String>)al.clone();
		System.out.println(inti);
		
//		Clear the added list
//	    al1.clear();
//		Check wether is empty r nott. 
//		 System.out.println("Is ArrayList Empty: "+al.isEmpty());	
		//Update using set
		
		
//		   arraylist.set(0, 11);
	}

}
