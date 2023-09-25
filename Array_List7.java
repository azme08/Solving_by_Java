//Check existing value in a ArrayList using get(index) method
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
       
        //Check existing value in a ArrayList
        
        int x=arr.get(3);
        System.out.println("The value is: "+x);
       
        
    }
   
}
