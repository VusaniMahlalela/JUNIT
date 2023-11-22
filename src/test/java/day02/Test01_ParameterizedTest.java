package day02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test01_ParameterizedTest {
    //test length of String is greater than 0
    //1. way without parameter
    @Test
    void TestLength(){
        assertTrue("Frotan".length()>0);
        assertTrue("Vusani".length()>0);
        assertTrue("het".length()>0);
    }
    //2.way parameterised test
    @ParameterizedTest
    @ValueSource(strings ={"Vusani","dodd"})
    void testLengthParameterizedTest(String str){
        assertTrue(str.length()>0);
    }
    @ParameterizedTest
    @CsvSource(value = {"JAVA,java","HELLO,hello","JUNIT,junit","TEST,test","IS EASY,is easy"})
    void testIsUpperCase(String a,String b){
        assertEquals(a,b.toUpperCase());
    }



    @Test
    void testUpperCase(){
        String a="Hello";
        String b="java";
        String c="junit";

        assertEquals("HELLO",a.toUpperCase());
        assertEquals("JAVA",b.toUpperCase());
        assertEquals("JUNIT",c.toUpperCase());
    }
    //test contains() using java---a --true junit--j--true---unit--a--false
    @ParameterizedTest
    @CsvSource(value = {"true,java,a","true,junit,u","false,hello,a"})
    void testContainsParamerizedTest(boolean a,String b,String c){
        assertEquals(a,b.contains(c));
    }
}
