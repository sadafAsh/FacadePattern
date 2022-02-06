package com.soj.designpattern.facade.impl;

import com.soj.designpattern.facade.Cube;
import com.soj.designpattern.facade.MultiplyTwoClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyTwoClassImplTest {

    @Test
    void TestToMultiplyOperator() {
        Cube cube=new CubeImpl();
        int value=cube.cube(3);
        CubeTimesTwoImpl cube1=new CubeTimesTwoImpl();
        cube1.multiplyCubeTimesTwo(cube,3);
        MultiplyTwoClass operator=new MultiplyTwoClassImpl();
        int result=operator.multiplyOperator(cube,cube1,3);
        Assertions.assertEquals(1458,result);

    }
}