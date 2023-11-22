package day01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test03_BeforeEach_AfterEach {
    String str ;

    @BeforeEach
    void beforeEach(){
        str = "Test methods should be simple";
        System.out.println("beforeEach() executed. Value of str is: "+str);
    }

    @AfterEach
    void afterEach(){
        str = "";
        System.out.println("afterEach() executed. Value of str is: "+str);
    }

    @Test
    void testArrays(TestInfo info){ //to display running method information
        String [] actualArray  = str.split(" ");
        String [] expectedArray = {"Test", "methods", "should", "be", "simple"};
        System.out.println(info.getDisplayName()+ " executed");
        assertTrue(Arrays.equals(expectedArray, actualArray));
    }

}


