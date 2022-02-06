package com.soj.designpattern.facade.impl;

import com.soj.designpattern.facade.Cube;
import com.soj.designpattern.facade.CubeTimesTwo;
import com.soj.designpattern.facade.Facade;
import com.soj.designpattern.facade.MultiplyTwoClass;

public class FacadeImpl implements Facade {
private Cube cube;
private CubeTimesTwo cubeTimesTwo;
private MultiplyTwoClass multiplyTwoClass;

    public FacadeImpl() {
        this.cube = new CubeImpl();
        this.cubeTimesTwo = new CubeTimesTwoImpl();
        this.multiplyTwoClass = new MultiplyTwoClassImpl();

    }

    public int cubeX(int x) {
        return cube.cube(x);
    }

    public int cubeXTimesTwo(int x) {
        return cubeTimesTwo.multiplyCubeTimesTwo(cube, x);

    }
    public int operateTwoObjects(int x){
        return multiplyTwoClass.multiplyOperator(cube,cubeTimesTwo,x);
    }
}