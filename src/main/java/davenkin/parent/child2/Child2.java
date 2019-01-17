package davenkin.parent.child2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Child2 {
    private static final Logger logger = LoggerFactory.getLogger(Child2.class);

    public void hello() {
        logger.info("info from child2");
        logger.debug("debug from child2");
    }
}
