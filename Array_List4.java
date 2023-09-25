//check a value is in the Array List or Not

import java.util.ArrayList;

public class Practice1 {

    public static void main(String[] args){
      
        ArrayList<Integer> arr=new ArrayList<>();
        
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        
        System.out.println("Array List Contains: "+arr);
        System.out.println("Size Of Array: "+arr.size());
       
        //check a value is in the Array List or Not
        
        boolean check=arr.contains(30);
        System.out.println("30 is in the List: "+check);
       
        
    }
   
}
