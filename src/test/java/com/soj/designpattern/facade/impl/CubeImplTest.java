package com.soj.designpattern.facade.impl;

import com.soj.designpattern.facade.Cube;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CubeImplTest {

    @Test
    void TestTocube() {

        Cube cube=new CubeImpl();
       int result= cube.cube(4);
        Assertions.assertSame(64,result);



    }
}