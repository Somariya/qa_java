package com.example;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParametrizedLionTest {
    private final String sex;
    boolean hasMane;
    Feline feline;


    public ParametrizedLionTest(String sex, boolean hasMane, Feline feline) {
        this.sex = sex;
        this.hasMane=hasMane;
        this.feline=feline;
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