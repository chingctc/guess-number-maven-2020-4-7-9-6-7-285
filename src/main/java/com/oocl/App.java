package com.oocl;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    private String randomNumber = "1234";
    private int aValue;
    String randomFirsDigit = randomNumber.substring(0,1);
    String randomSeconDigit = randomNumber.substring(1,2);
    String randomThirDigit = randomNumber.substring(2,3);
    String randomLasDigit =  randomNumber.substring(3,4);

    public int correctNumberButWrongPosition(String inputValue) {
        String inputFirsDigit = inputValue.substring(0,1);
        String inputSeconDigit = inputValue.substring(1,2);
        String inputThirDigit = inputValue.substring(2,3);
        String inputLasDigit =  inputValue.substring(3,4);
        String[] inputNumberArray = {inputFirsDigit,inputSeconDigit,inputThirDigit,inputLasDigit};
        System.out.print(Arrays.toString(inputNumberArray));

        String[] randomNumberArray = {randomFirsDigit,randomSeconDigit,randomThirDigit,randomLasDigit};
        System.out.print(Arrays.toString(randomNumberArray));
        System.out.print(Arrays.equals(inputNumberArray,randomNumberArray));
        if(Arrays.equals(inputNumberArray,randomNumberArray)) {
            this.aValue = 4;
        };
        return aValue;
    }

}
