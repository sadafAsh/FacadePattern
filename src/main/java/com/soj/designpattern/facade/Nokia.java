package com.soj.designpattern.facade;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Nokia implements MobileShop {
    static final Logger logger= LogManager.getLogger(Nokia.class.getName());
    @Override
    public void modelNo() {
        logger.debug("The model no of Nokia is X100");
    }

    @Override
    public void price() {
logger.debug("The price of the Nokia is Rs45000.0");
    }
}
