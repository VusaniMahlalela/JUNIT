package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test01_Assertions {

    @Test
    public void test(){


    }

    //Method to test length of String
    @Test
    public void testLength(){
        String str="Hello World";
        int actualValue=str.length();
        int expectedValue=11;
        assertEquals(expectedValue,actualValue);
    }

    //test upper case method from String class
@Test
    public void testUpperCase(){
        String actualString="hello".toUpperCase();
        String expected="HELLO";
        assertEquals(expected,actualString,"UpperCase method failed");
    }
    //testing Math.addExact(
    @Test
    void testSum(){
        int num1=10;
        int num2=13;
        int actualValue=Math.addExact(num1,num2);
        int expectedValue=23;
        assertEquals(expectedValue,actualValue);

    }
    //We do not need to create seperate variable
    //String.Contains()
    @Test
    void testContains(){
        assertEquals(false,"Java".contains("z"));
    }



}
