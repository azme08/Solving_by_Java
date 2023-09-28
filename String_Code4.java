//using replace and split method in a string

public class Practice1 {

    public static void main(String[] args){
      
       String s1="Bangladesh is my Country";
        System.out.println(s1);
        
        //replace a value in string
        String x=s1.replace('a', 'j');
        System.out.println(x);
        
        //split string depends on space
        String[] s2=s1.split(" ");
        for(String y : s2){
            System.out.println(y);
        }
            
    }
   
}
