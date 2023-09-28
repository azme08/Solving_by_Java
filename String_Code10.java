//convert decimal into binary,octal,hexadecimal number 
public class Practice1 {

    public static void main(String[] args){
      
        
       //Decimal to Binary
       int dec=7;
       String bin=Integer.toBinaryString(dec);
        System.out.println(bin);
        
        //Decimal to Octal
        int dec1=11;
        String oc=Integer.toOctalString(dec1);
        System.out.println(oc);
        
        //decimal to hexadecimal
        int dec2=15;
        String hex=Integer.toHexString(dec2);
        System.out.println(hex);
        
            
    }
   
}
