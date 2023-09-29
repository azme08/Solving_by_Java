//Current date check and formating date
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice1 {

    public static void main(String[] args){
      
        
        Date date=new Date();
        System.out.println(date);
        
        //formating date
        DateFormat df=new SimpleDateFormat("dd/MM/YYYY");
            String currentDate=df.format(date);
            System.out.println(currentDate);
            
    }
   
}
