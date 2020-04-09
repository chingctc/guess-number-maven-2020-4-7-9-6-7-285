package com.oocl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomAnswerGenerator implements AnswerGenerator {
    private ArrayList<String> randomNumberArray = new ArrayList<String>();
    ArrayList<Integer> numberListForRandomNumber = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
    public static final int ANSWER_LENGTH = 4;

    public ArrayList<String> generate(){
        /**
         * Hardcoded randomNumberArray = 1234
         * For Testing only
         */
//        randomNumberArray.add("1");
//        randomNumberArray.add("2");
//        randomNumberArray.add("3");
//        randomNumberArray.add("4");
        /**
         * End of hardcoded logic for randomNumberArray
         */

        if (randomNumberArray.size() == 0) {
            for (int count = 0; count < ANSWER_LENGTH; count++) {
                Random rand = new Random();
                int randomIndex = rand.nextInt(numberListForRandomNumber.size());
                randomNumberArray.add(numberListForRandomNumber.get(randomIndex) + "");
                numberListForRandomNumber.remove(randomIndex);
            }
        }
        System.out.print(randomNumberArray.toString());  // Display random number for checking
        return randomNumberArray;
    }
}
