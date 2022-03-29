import  org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.Test;
import static java.lang.Character.isLetterOrDigit;


public class Testing2 {
    RandomCharacter rc;
    @BeforeEach
    public void initTest()
    {
        rc = new RandomCharacter();
    }
   

    @RepeatedTest(10)
    public void testPrimeRandom()
    {
        assertTrue(rc.isPrime('a'));
        assertFalse(rc.isPrime('6'));
        assertFalse(rc.isPrime('1'));
        assertFalse(rc.isPrime('4'));
    }
    
}
