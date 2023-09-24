//Array sorting in Ascending Order

import java.util.Arrays;

public class Practice1 {

    public static void main(String[] args){
      
        int[] arr ={10,12,7,9,5};
        Arrays.sort(arr);
        
        for (int i = 0; i < 5; i++) {
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
        
    }
   
}
