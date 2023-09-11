//Sum_Of_Digits
import java.util.Scanner;
public class JavaApplication3 {
    public static void main(String[] args) {             
       int temp,r,sum=0;
        Scanner sc = new Scanner(System.in);
         temp=sc.nextInt();
        
        while(temp!=0){
            r=temp%10;
            sum+=r;
            temp=temp/10;
        }
        System.out.println(sum);                             
    }
    
}
