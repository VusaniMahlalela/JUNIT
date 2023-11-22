package day02;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test02_RepeatedTestMultipleTimes {
    @RepeatedTest(2)
    void testSubString(){
        assertEquals("java","java is important".substring(0,4));
        System.out.println("test substring");
    }
    //Test for addExact
   @RepeatedTest(5)
    void testAddExact(){
        assertEquals(2,Math.addExact(1,1));
    }
    Random rnd=new Random();
    @RepeatedTest(5)
@Disabled("I will use this method later")
    void testMathExactWithRandomNumber(){
        int num1=rnd.nextInt(10);
        int num2=rnd.nextInt(10);
        assertEquals(num1+num2,Math.addExact(num1,num2));
        System.out.println("num1: " +num1 +"--" +"num2:" +num2);
    }

}
