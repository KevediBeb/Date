import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(datum());
    }
    public static String datum(){
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String time = Calendar.getInstance(Locale.FRANCE).getTime().toString();

        String result = time.substring(0, 11);
        String day  = result.substring(8, 11);
        String month = result.substring(4, 7);
        String year = time.substring(24, 28);
        // converting month(string) to month(int)
        for(int i = 0; i < months.length; i++){
            if(month.equals(months[i])){

                month = Integer.toString(i + 1);
                if((i+1) <= 9){
                    month = "0" + month;

                }
            }
        }
        //final result
        result = year + "-" + month + "-" + day;
        return result;

    }
}