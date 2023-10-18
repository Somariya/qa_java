package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void checkCountOfKittens() throws Exception{
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самец",feline);
        int actualResult = lion.getKittens();
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void invalidSexTest() throws Exception {
        Lion lion = new Lion("Заяц",feline);
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedResult, lion);
    }


}


