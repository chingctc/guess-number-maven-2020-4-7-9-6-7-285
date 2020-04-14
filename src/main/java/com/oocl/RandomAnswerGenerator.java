package com.oocl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomAnswerGenerator implements AnswerGenerator {
    public static final int EMPTY = 0;
    public static final String STRING_FORMATTER = "";
    private ArrayList<String> randomNumberArray = new ArrayList<String>();
    ArrayList<Integer> numberListForRandomNumber = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
    public static final int ANSWER_LENGTH = 4;

    public ArrayList<String> generate() {
        if (randomNumberArray.size() == EMPTY) {
            for (int count = 0; count < ANSWER_LENGTH; count++) {
                Random rand = new Random();
                int randomIndex = rand.nextInt(numberListForRandomNumber.size());
                randomNumberArray.add(numberListForRandomNumber.get(randomIndex) + STRING_FORMATTER);
                numberListForRandomNumber.remove(randomIndex);
            }
        }
        return randomNumberArray;
    }
}
