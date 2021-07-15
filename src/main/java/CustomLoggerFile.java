import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class CustomLoggerFile {

    private static Logger LOG = Logger.getLogger(CustomLoggerFile.class);

    public static void main(String[] args) {
        logWidthBasicConfiguration();
        logWidthDOMConfiguration();
    }
    public static void logWidthBasicConfiguration(){
        BasicConfigurator.configure();
        LOG.info("Message");
        LOG.debug("Debug");
        LOG.error("Eror");
        LOG.warn("Warn");
    }
    public static void logWidthDOMConfiguration(){
        DOMConfigurator.configure("logerConfig.xml");
        LOG.info("Message");
        LOG.debug("Debug");
        LOG.error("Eror");
        LOG.warn("Warn");
    }
}
