//Sorting Array in Descending form
import java.util.Arrays;

public class Practice1 {

    public static void main(String[] args){
      
        int[] arr ={10,12,7,9,5};
        Arrays.sort(arr);
  
        System.out.print("Descending: ");
        for (int i =4 ; i >=0; i--) {
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
    }
   
}
