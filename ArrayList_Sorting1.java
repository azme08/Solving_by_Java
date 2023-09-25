//Sorting a simple ArrayList 
import java.util.ArrayList;
import java.util.Collections;


public class Practice1 {

    public static void main(String[] args){
      
        ArrayList<Integer> arr1=new ArrayList<>();
      
        
        arr1.add(70);
        arr1.add(20);
        arr1.add(50);
        arr1.add(40);
        System.out.println("Before Sorting: "+arr1);
        
        Collections.sort(arr1);
       
        System.out.println("After Sortng: "+arr1);
       
        
    }
   
}
