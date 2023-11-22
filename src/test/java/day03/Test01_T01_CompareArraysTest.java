package day03;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Test01_T01_CompareArraysTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest
    @MethodSource("arrayArguments")
    void testCompareArraysEqual(boolean result,Object[] a,Object[] b) {
  assertEquals(result,T01_CompareArrays.compareArraysEqual(a,b));

    }
    static Stream<Arguments> arrayArguments(){

        Integer a1[]={2,5,7,9};
        Integer a2[]={5,2,9,7};

        String [] s1={"a","j","a","v"};
        String [] s2={"a","j","a","v"};

        Double []d1={1.4,5.7,4.4};
        Double []d2={5.7,4.4,1.4};
        return Stream.of(Arguments.of(true,a1,a2),
        Arguments.of(true,s1,s2),
        Arguments.of(true,d1,d2));
    }
}