package davenkin.parent;

import davenkin.parent.child1.Child1;
import davenkin.parent.child2.Child2;
import davenkin.parent.child3.Child3;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Parent {
    private static final Logger logger = LoggerFactory.getLogger(Parent.class);

    public static void main(String[] args) {
        logger.info("info from parent");
        logger.debug("debug from parent");
        new Child1().hello();
        new Child2().hello();
        new Child3().hello();
    }

}
