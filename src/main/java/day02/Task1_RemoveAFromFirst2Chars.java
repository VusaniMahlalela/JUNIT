package day02;

public class Task1_RemoveAFromFirst2Chars {

    public String deleteAIfItIsFoundInFirst2Chars(String str){
        //Check the length
        if(str.length()<=2) return str.replaceAll("A","");

        String firstTwoChars=str.substring(0,2);
        String charsAfterFirstTwo=str.substring(2);

        return firstTwoChars.replaceAll("A","")+charsAfterFirstTwo;


    }
}
