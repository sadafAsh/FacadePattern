package com.soj.designpattern.facade;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Oppo implements MobileShop {
    static final Logger logger = LogManager.getLogger(Oppo.class.getName());

    @Override
    public void modelNo() {
        System.out.println("Reno6Lite");
        logger.debug("The model no of Oppo is Reno6Lite");
    }

    @Override
    public void price() {
        logger.debug("The price of the oppo is Rs69999.0");
    }
}
