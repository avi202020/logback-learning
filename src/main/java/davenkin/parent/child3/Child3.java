package davenkin.parent.child3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Child3 {
    private static final Logger logger = LoggerFactory.getLogger("performance-logger");

    public void hello() {
        logger.debug("debug from performance");
    }
}
