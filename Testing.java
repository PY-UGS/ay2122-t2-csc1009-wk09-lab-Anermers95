import  org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.Test;
import static java.lang.Character.isLetterOrDigit;
public class Testing {

    RandomCharacter rc;

    @BeforeEach
    public void initTest()
    {
        rc = new RandomCharacter();
    }

    @RepeatedTest(10)
    public void testGetRandomLowerChar()
    {
        char value = rc.getRandomLowerCaseLetter();

        assertTrue(value <= 'z' && value >= 'a');
        assertTrue(isLetterOrDigit(value));
        assertFalse(Character.isUpperCase(value));
    }

    @RepeatedTest(10)
    public void testUpperCase()
    {
        char value = rc.getRandomUpperCaseLetter();

        assertTrue(value <= 'Z' && value >= 'A');
        assertFalse(Character.isLowerCase(value));
    }

    @RepeatedTest(10)
    public void testRandomDigit()
    {
        char value = rc.getRandomDigitCharacter();

        assertTrue(value>= 48 && value <= 57);
        assertTrue(isLetterOrDigit(value));
        assertFalse(Character.isAlphabetic(value));
    }
    @RepeatedTest(10)
    public void testRandomChar()
    {
        char value = rc.getRandomLowerCaseLetter();

        assertTrue(value>=0 && value <= 127);
        assertTrue(isLetterOrDigit(value));
    }
    
}
