package io.raveerocks.beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DemoBeta {

    private static final Logger LOGGER = LogManager.getLogger(DemoBeta.class);

    public static void main(String[] args) {
        LOGGER.fatal("Fatal Message");
        LOGGER.error("Error Message");
        LOGGER.warn("Warning Message");
        LOGGER.info("Info Message");
        LOGGER.debug("Debug Message");
        LOGGER.trace("Trace Message");
    }


}
