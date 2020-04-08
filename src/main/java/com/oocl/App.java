package com.oocl;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    private String randomNumber = "1234";
    private int aValue = 0;
    private int bValue = 0;
    private String result = "";
    String randomFirsDigit = randomNumber.substring(0,1);
    String randomSeconDigit = randomNumber.substring(1,2);
    String randomThirDigit = randomNumber.substring(2,3);
    String randomLasDigit =  randomNumber.substring(3,4);

    public String checkCorrectNumberAndPosition(String inputValue) {
        if(inputValue.length() != 4) {
            return "Wrong Input, input Again";
        }

        String input1Digit = inputValue.substring(0,1);
        String input2Digit = inputValue.substring(1,2);
        String input3Digit = inputValue.substring(2,3);
        String input4Digit =  inputValue.substring(3,4);
        ArrayList<String> inputNumberArray = new ArrayList<String>(Arrays.asList(input1Digit,input2Digit,input3Digit,input4Digit));
        System.out.print(inputNumberArray.toString());

        ArrayList<String> randomNumberArray = new ArrayList<String>(Arrays.asList(randomFirsDigit,randomSeconDigit,randomThirDigit,randomLasDigit));
        System.out.print(randomNumberArray.toString());

        for (int i = 0; i < inputNumberArray.size(); i++) {
            for (int j = i+1; j < inputNumberArray.size(); j++) {
                if(inputNumberArray.get(i).equals(inputNumberArray.get(j))) {
                    System.out.println(inputNumberArray.get(i) + inputNumberArray.get(j) + "x");
                    return "Wrong Input, input Again";
                }
            }
        }

        for (int i = 0; i < inputNumberArray.size(); i++) {
            if (inputNumberArray.get(i).equals(randomNumberArray.get(i))) {
                aValue += 1;
            } else {
                if(randomNumberArray.contains(inputNumberArray.get(i))) {
                    bValue += 1;
                }
            }
        }
        result = aValue + "A" + bValue + "B";
        return result;
    }
}
