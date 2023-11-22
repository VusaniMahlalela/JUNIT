package day02;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task1_RemoveAFromFirst2CharsTest {
 Task1_RemoveAFromFirst2Chars removeA;
    @BeforeEach
    void setUp() {
     removeA=new Task1_RemoveAFromFirst2Chars();
        System.out.println("BeforeEach is executed");
    }

    @AfterEach
    void tearDown() {
     removeA=null;
        System.out.println("BeforeEach is executed");
    }

   @ParameterizedTest
   @CsvSource(value = {"BB,AABB","BAB,ABAB","'',AA"
   })
    void deleteAIfItIsFoundInFirst2Chars(String expected,String actual) {
     assertEquals(expected,removeA.deleteAIfItIsFoundInFirst2Chars(actual));
    }
}