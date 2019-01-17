package davenkin.parent.child1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Child1 {
    private static final Logger logger = LoggerFactory.getLogger(Child1.class);

    public void hello() {
        logger.info("info from child1");
        logger.debug("debug from child1");
    }
}
