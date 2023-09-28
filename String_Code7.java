//Convert Primitive to Object
// Convert Object to primitive

public class Practice1 {

    public static void main(String[] args){
      
        //convert primitive to object
        int x=30;
        Integer y=Integer.valueOf(x);
        System.out.println(y);
        
        //Autoboxing...... Direct use
        Integer z=x;
        System.out.println(z);
        
        //convert object to primitive
        Double d=new Double(20.5);
        System.out.println(d);
        
        double m=d.doubleValue();//change your datatype
        System.out.println(m);
        
        //Unboxing method
        double n=d;
        System.out.println(n);
       
            
    }
   
}
