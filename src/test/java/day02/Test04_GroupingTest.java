package day02;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test04_GroupingTest {

    @Nested
    class testMultiply {

        @ParameterizedTest
        @CsvSource({
                "-12,3,-4",
                "-12,-3,4",
                "12,-3,-4"
        })
        void testMultiplyWithNoneZero(int result, int a, int b) {
            assertEquals(result, Math.multiplyExact(a, b));
        }

        @ParameterizedTest
        @CsvSource({
                "0,0,-4",
                "0,-3,0",
                "0,0,0"})
        void testMultiplyWithZero(int result, int a, int b) {
            assertEquals(result, Math.multiplyExact(a, b));

        }

        @Nested
        class testSum {

            //ADD exact
            @ParameterizedTest
            @CsvSource({
                    "0,0,0",
                    "7,0,7",
                    "-3,-1,-2"})
            void testSumWithoutZEro(int result,int c,int d){
                assertEquals(result,Math.addExact(c,d));
            }

            @ParameterizedTest
            @CsvSource({
                    "0,0,0",
                    "7,0,7",
                    "-3,-1,-2"})
            void testSumWithZero(int result,int e,int f){
                assertEquals(result,Math.addExact(e,f));
            }



        }
    }
}
