//Some StringBuffer methods
public class Practice1 {

    public static void main(String[] args){
      
       StringBuffer sb=new StringBuffer("Abdullah");
            System.out.println(sb);
            
            //Add any data types with string
            sb.append(" Al Azme");
            System.out.println(sb);
            sb.append(25);
            System.out.println(sb);
            
            
           
            //fixed a length
            sb.setLength(15);
            System.out.println(sb);
            
            //give two indexs for delete values
            sb.delete(0, 5);
            System.out.println(sb);
            
            //Reverse string
            sb.reverse();
            System.out.println(sb);
    }
   
}
