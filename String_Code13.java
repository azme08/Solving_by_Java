//Guess a random number
public class Practice1 {

    public static void main(String[] args){
      
        Random ran=new Random();
        int num=ran.nextInt(9);//0 to 9 
        System.out.println(num);
        
        
       int num1=ran.nextInt(9)+1;//1 to 10 
        System.out.println(num1);
        
        
        int num2=ran.nextInt(9)+5;//5 to 14
        System.out.println(num2);
    }
   
}
