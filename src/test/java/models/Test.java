package models;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.sql.SQLInput;
import org.apache.commons.logging.LogFactory;

public class Test {
    public static final Logger logger = LogManager.getLogger("HelloWorld");
    public static void main(String[] args) {
        logger.fatal("Fatal");
        logger.error("Error");
        logger.warn("Warn");
        logger.info("Info");
        logger.debug("Debug");
        logger.trace("Trace");

    }
}
