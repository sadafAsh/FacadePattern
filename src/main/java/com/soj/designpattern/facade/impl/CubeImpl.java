package com.soj.designpattern.facade.impl;


import com.soj.designpattern.facade.Cube;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CubeImpl implements Cube {
    static final Logger logger = LogManager.getLogger(CubeImpl.class.getName());

    @Override
    public int cube(int x) {
        return x*x*x;
    }
}
