package com.soj.designpattern.facade;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IPhone implements MobileShop {
    static final Logger logger = LogManager.getLogger(IPhone.class.getName());

    @Override
    public void modelNo() {
        logger.debug("The model no of Ipnhone is IPhone 7");
    }

    @Override
    public void price() {
        logger.debug("The price of the Iphone is Rs65000.0");
    }
}
