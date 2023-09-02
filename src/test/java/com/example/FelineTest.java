package com.example;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    Feline feline;

    @Test
    public void getFoodPredatorSuccess() throws Exception{
        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void getFamilyFeline(){
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittenSuccess(){
        Assert.assertTrue(feline.getKittens()==1);
    }

}