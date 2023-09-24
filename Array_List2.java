//Delete a value from Array List
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
        //Remove Elements
        arr.remove(2);
        System.out.println("After Removing Element: "+arr);
       
        
    }
   
