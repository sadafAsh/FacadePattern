package com.soj.designpattern.facade.impl;

import com.soj.designpattern.facade.Cube;
import com.soj.designpattern.facade.CubeTimesTwo;

public class CubeTimesTwoImpl implements CubeTimesTwo {


    @Override
    public int multiplyCubeTimesTwo(Cube cube, int x) {
        return 2*cube.cube(x);
    }
}
