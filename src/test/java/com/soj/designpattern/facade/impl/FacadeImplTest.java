package com.soj.designpattern.facade.impl;

import com.soj.designpattern.facade.Cube;
import com.soj.designpattern.facade.CubeTimesTwo;
import com.soj.designpattern.facade.Facade;
import com.soj.designpattern.facade.MultiplyTwoClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacadeImplTest {

    @Test
    void TestForcubeXToPassed() {
        Facade facade=new FacadeImpl();
        Cube cube=new CubeImpl();
        int value=cube.cube(4);
       int result= facade.cubeX(4);
        Assertions.assertEquals(result,value);

        }


    @Test
    void cubeXTimesTwo() {
        Facade facade=new FacadeImpl();
        Cube cube=new CubeImpl();
        cube.cube(4);
        CubeTimesTwo cube1=new CubeTimesTwoImpl();
      int value=  cube1.multiplyCubeTimesTwo(cube,4);
       int result= facade.cubeXTimesTwo(4);
        Assertions.assertEquals(result,value);
    }

    @Test
    void operateTwoObjects() {
        Facade facade=new FacadeImpl();
        Cube cube=new CubeImpl();
        cube.cube(4);
        CubeTimesTwo cube1=new CubeTimesTwoImpl();
         cube1.multiplyCubeTimesTwo(cube,4);
        MultiplyTwoClass operate=new MultiplyTwoClassImpl();
        int value=operate.multiplyOperator(cube,cube1,4);
        int result=facade.operateTwoObjects(4);
        Assertions.assertEquals(result,value);


    }
}