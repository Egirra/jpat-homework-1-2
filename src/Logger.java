import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private int num = 1;
    private static Logger logger;
    public static Date dateNow = new Date();
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    private Logger() {}

    public void log(String msg) {
        System.out.println("[" + dateFormat.format(dateNow) + " " + num++ + "] " + msg);
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }
}