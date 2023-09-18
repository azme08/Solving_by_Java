//check username and password matching
import java.util.Scanner;

public class JavaApplication3 {
    
    public static void main(String[] args) {
       
     Scanner sc = new Scanner(System.in);

     while(sc.hasNext()){
         
       String x=sc.nextLine();
       String y=sc.nextLine();
     
     if("azme".equals(x) && "12345".equals(y)){
         
         System.out.println("Welcome to system!");
         break;
     }else{
         System.out.println("Incorrect username/password. Please try again! ");
     }
     }
    }
    
}
