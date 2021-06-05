package io.raveerocks.alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DemoAlpha {

    private static final Logger LOGGER = LogManager.getLogger(DemoAlpha.class);

    public static void main(String[] args) {
        LOGGER.fatal("Fatal Message");
        LOGGER.error("Error Message");
        LOGGER.warn("Warning Message");
        LOGGER.info("Info Message");
        LOGGER.debug("Debug Message");
        LOGGER.trace("Trace Message");
    }


}
