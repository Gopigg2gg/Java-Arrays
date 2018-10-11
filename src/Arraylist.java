import java.util.*; 
class Arraylist {  
    public static void main(String args[]){   
        
       ArrayList<Integer> alist=new ArrayList<Integer>();  
       alist.add(1);
       alist.add(7);
       alist.add(3);
       alist.add(9);
       alist.add(1);
       alist.add(6);
   
//       //displaying elements
        System.out.println(alist);
   
//        Adding "Steve" at the fourth position
        alist.add(3, 3);
        alist.remove(5);
//   
//        displaying elements
        System.out.println(alist);
    }  

 }