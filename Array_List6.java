//Replace a value in ArrayList using Set function

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
       
        //Replace a value using Set function
        
        arr.set(3, 50);
        System.out.println("After replacing value in Index 3: "+arr);
       
        
    }
   
}
