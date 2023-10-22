package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

//import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

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
    public void invalidSexTest() {
        Exception exception = assertThrows(Exception.class, () -> new Lion("Он", feline));
        String excepted = "Используйте допустимые значения пола животного - самей или самка";
        String actual = exception.getMessage();
        assertEquals(excepted, actual);
    }


}


