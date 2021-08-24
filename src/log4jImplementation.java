import org.apache.log4j.Logger;
import java.util.Scanner;
import org.apache.log4j.xml.DOMConfigurator;
public class log4jImplementation {
    static Logger log=Logger.getLogger(log4jImplementation.class);
    public static void main(String[] args) {
        DOMConfigurator.configure("log4j.xml");
        System.out.println("hello world");
        log.info("System check 1");
    }
}

