import java.text.SimpleDateFormat;
import java.util.Date;

class datetime {
    public static void main(String [] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date date = new Date();
        System.out.printf(formatter.format(date));
    }
}
