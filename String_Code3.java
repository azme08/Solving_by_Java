// Basic String codes using many methods

public class Practice1 {

    public static void main(String[] args){
      
       String s1="Bangladesh is my Country";
        System.out.println(s1);
        
        //remove extra space of a string 1st and last space not middle space
        String s2=s1.trim();
        System.out.println(s2);
        //find a single character in a string using index
        char ch1=s1.charAt(0);
        System.out.println(ch1);
        
        //give a values index in a string a get ASCCI value
        int val=s1.codePointAt(2);
        System.out.println(val);
        
        //check index of a value in string 
        //note:if one value have more times in a string, Then show the first value"s index
        int in=s1.indexOf('a');
        System.out.println(in);
        
        //check last index of a value
        int pos=s1.lastIndexOf('n');
        System.out.println(pos);
        
    }
   
}
