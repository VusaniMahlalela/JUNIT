package day03;

import java.util.Arrays;

public class T01_CompareArrays {

    public static boolean compareArraysEqual(Object[] a,Object[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);


    }
}
