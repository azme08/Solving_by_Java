//Some functions using procedure

public class Practice1 {

    public static void main(String[] args){
      
        String fname="Abdullah Al";
        String lname=" Azme";
        
        //Add two or more strings using concat() method
        String name=fname.concat(lname);
        System.out.println(name);
        
        //All upper Case 
        String upperName=name.toUpperCase();
        System.out.println(upperName);
        
        //All Lower Case
        String LowerName=name.toLowerCase();
        System.out.println(LowerName);
        
        //check string's starting word matching or not
        boolean x=fname.startsWith("A");
        System.out.println(x);
        
        //check string's ending word matching or not
        boolean x1=fname.endsWith("l");
        System.out.println(x1);
        
        
        
        
    }
   
}
