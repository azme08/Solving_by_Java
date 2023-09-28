//Check palindrome or not
import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
       StringBuffer sb=new StringBuffer(s1);
  
            String s2=sb.reverse().toString();
            if(s1.equals(s2)){
                System.out.println("Palindrome");
            }else{
                System.out.println("Not Palindrome");
            }
            
    }
   
}
