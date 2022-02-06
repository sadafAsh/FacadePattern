package com.soj.designpattern.facade.impl;

import com.soj.designpattern.facade.Cube;
import com.soj.designpattern.facade.CubeTimesTwo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CubeTimesTwoImplTest {

    @Test
    void TestToMultiplyCubeTimesTwo() {
        Cube cube=new CubeImpl();
        int value=cube.cube(3);
        CubeTimesTwoImpl cube1=new CubeTimesTwoImpl();
       int result= cube1.multiplyCubeTimesTwo(cube,3);
        Assertions.assertSame(54,result);
    }}