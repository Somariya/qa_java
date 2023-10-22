package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParametrizedLionTest {
    private final String sex;
    boolean hasMane;
    Feline feline;


    public ParametrizedLionTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane=hasMane;
    }

    @Parameterized.Parameters
            public static Object[][] getTSex(){
        return new Object[][]{
                {"Самец",true},
                {"Самка",false}
        };
    }

    @Test
    public void doesHaveName() throws Exception{
        Lion lion = new Lion(sex,feline);
        boolean actualResult=lion.doesHaveMane();
        assertEquals(hasMane, actualResult);

    }


}