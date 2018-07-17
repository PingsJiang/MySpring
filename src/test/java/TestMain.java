import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.junit.Test;

public class TestMain {

    private static Logger logger = Logger.getLogger(TestMain.class);


    @Test
    public void test() {
        logger.debug("≤‚ ‘debug....");
        logger.info("≤‚ ‘£∫....");
        logger.error("error....");
    }
}
