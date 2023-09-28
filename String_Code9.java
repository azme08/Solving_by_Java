//convert binary,octal,hexadecimal number into decimal
public class Practice1 {

    public static void main(String[] args){
      
        
        //binary to decimal
        String bn="1011";
        Integer dec1=Integer.parseInt(bn, 2);
        System.out.println(dec1 );
        
        
        //octal to decimal
        String oc="111";
        Integer dec2=Integer.parseInt(oc, 8);
        System.out.println(dec2 );
        
        //hexadecimal to decimal
        String hex="b";
        Integer dec3=Integer.parseInt(hex, 16);
        System.out.println(dec3 );
        
        
        
            
    }
   
}
