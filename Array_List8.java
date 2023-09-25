//Check Two Array same or Not

import java.util.ArrayList;

public class Practice1 {

    public static void main(String[] args){
      
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        ArrayList<Integer> arr3=new ArrayList<>();
        
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        arr1.add(40);
        System.out.println("Array No1: "+arr1);
        
        
        arr2.add(50);
        arr2.add(60);
        arr2.add(70);
        arr2.add(80);
        System.out.println("Array No2: "+arr2);
        
        arr3.addAll(arr1);
        System.out.println("Array No3: "+arr3);
        
        //Two Array same or not
        
        boolean x=arr1.equals(arr2);
        System.out.println("arr1==arr2: "+x);
        
        boolean y=arr1.equals(arr3);
        System.out.println("arr1==arr3: "+y);
        
        
       
        
    }
   
}
