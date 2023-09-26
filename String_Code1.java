//how to use functions in String

public class Practice1 {

    public static void main(String[] args){
      
        String s1="Abdullah Al Azme";
        String s2=new String("Abdullah Al Azme");
        
        char[] s3={'a','z','m','e'};
        
        System.out.println(s1+"\n"+s2);
        System.out.println(s3);
        
        
        System.out.println("Length OF s1: "+s1.length());
       
        //Check Strings Equal or not
        if(s1.equals(s2)){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
        
        if(s1.contains(s2)){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
        
        //Value Checking present or Not
        if(s1.contains("Azme")){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
        
        //Uppercse lower case equals check
        
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
        
        // A value containing or not in String
        boolean c=s1.contains("Ami");
        System.out.println(c);
        
        boolean c1=s1.contains("Azme");
        System.out.println(c1);
        
        //String empty or not checking
        boolean e=s1.isEmpty();
        System.out.println(e);
        
        
    }
   
}
