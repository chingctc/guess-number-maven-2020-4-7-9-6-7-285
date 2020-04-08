package com.oocl;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    private String randomNumber = "1234";
    private int aValue = 0;
    String randomFirsDigit = randomNumber.substring(0,1);
    String randomSeconDigit = randomNumber.substring(1,2);
    String randomThirDigit = randomNumber.substring(2,3);
    String randomLasDigit =  randomNumber.substring(3,4);

    public int checkCorrectNumberAndPostition(String inputValue) {
        String input1Digit = inputValue.substring(0,1);
        String input2Digit = inputValue.substring(1,2);
        String input3Digit = inputValue.substring(2,3);
        String input4Digit =  inputValue.substring(3,4);
        String[] inputNumberArray = {input1Digit,input2Digit,input3Digit,input4Digit};
        System.out.print(Arrays.toString(inputNumberArray));

        String[] randomNumberArray = {randomFirsDigit,randomSeconDigit,randomThirDigit,randomLasDigit};
        System.out.print(Arrays.toString(randomNumberArray));


        for (int i = 0; i <= inputNumberArray.length; i++) {
            if (inputNumberArray[i].equals(randomNumberArray[i])) {
                aValue += 1;
                System.out.println(aValue);
            } else {
              aValue += 0;
            }
            return aValue;
        }
        System.out.println(aValue);
        return aValue;
    }
}
