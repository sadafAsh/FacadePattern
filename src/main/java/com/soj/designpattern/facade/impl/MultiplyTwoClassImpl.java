package com.soj.designpattern.facade.impl;

import com.soj.designpattern.facade.Cube;
import com.soj.designpattern.facade.CubeTimesTwo;
import com.soj.designpattern.facade.MultiplyTwoClass;

public class MultiplyTwoClassImpl implements MultiplyTwoClass {


    @Override
    public int multiplyOperator(Cube cube, CubeTimesTwo cubeTimes, int x) {
        return cube.cube(x)*cubeTimes.multiplyCubeTimesTwo(cube,x);
    }
}
