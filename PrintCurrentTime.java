import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class PrintCurrentTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(time.format(f));
    }
}
