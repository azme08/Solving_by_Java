//Check Local Time and format time
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;



public class Practice1 {

    public static void main(String[] args){
      
        LocalTime time=LocalTime.now();
        System.out.println(time);
        
        //Formatting Time
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm:ss");
        String x=time.format(dtf);
        System.out.println(x);
    }
   
}
