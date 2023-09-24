//String Type Array sorting Ascending and Descending both

import java.util.Arrays;

public class Practice1 {

    public static void main(String[] args){
      
        String[] arr={"azme","naim","sakib","neyamot"};
        Arrays.sort(arr);
  
        System.out.print("Ascending: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
        
        System.out.print("Descending: ");
        for (int i =3 ;i >=0; i--) {
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
    }
   
}
