//Convert primitive to String
//Convert String to primitive

public class Practice1 {

    public static void main(String[] args){
      
        //convert primitive to string
        int x=100;
        String s=Integer.toString(x);
        System.out.println(s);
        
        //convert string to primitive
        String a="20";
        int b=Integer.parseInt(a);
        System.out.println(b);
       
        //using valueOf method
        String m="20.30";
        double n=Double.valueOf(m);
        System.out.println(n);
            
    }
   
}
