package com.soj.designpattern.facade;

import com.soj.designpattern.facade.impl.FacadeImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {

        Facade facadeImpl = new FacadeImpl();

        int x = 3;
        int result1 = facadeImpl.cubeX(x);
        int result2 = facadeImpl.cubeXTimesTwo(x);
        int result3 = facadeImpl.operateTwoObjects(x);


        logger.log(Level.DEBUG, "Cube of {} is {}", x, result1);
        logger.log(Level.DEBUG, "cube of {} times 2 is {}", x, result2);
        logger.log(Level.DEBUG, "Multiply two objects is {} ", result3);
    }
}
