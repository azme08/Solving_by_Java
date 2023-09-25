//Check Array List Empty or Not

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
       
        //check Array List Empty or Not
        boolean bl=arr.isEmpty();
        System.out.println("ArrayList Empty or Not: "+bl);
        
       
        
    }
   
}
