package com.oocl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    private ArrayList<String> randomNumberArray = new ArrayList<String>();
    ArrayList<Integer> numberListForRandomNumber = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
    private String result = "";

    public String checkCorrectNumberAndPosition(String inputValue) {
        int aValue = 0;
        int bValue = 0;
        if (inputValue.length() != 4) {
            return "Wrong Input, input Again";
        }

        if (randomNumberArray.size() == 0) {
            for (int count = 0; count < 4; count++) {
                Random rand = new Random();
                int randomIndex = rand.nextInt(numberListForRandomNumber.size());
                randomNumberArray.add(numberListForRandomNumber.get(randomIndex) + "");
                numberListForRandomNumber.remove(randomIndex);
            }
        }
        System.out.print(randomNumberArray.toString());

        ArrayList<String> inputNumberArray = new ArrayList<String>();
        for (int inputValueIndex = 0; inputValueIndex < inputValue.length(); inputValueIndex++) {
            inputNumberArray.add(String.valueOf(inputValue.charAt(inputValueIndex)));
        }

        for (int arrayIndex = 0; arrayIndex < inputNumberArray.size(); arrayIndex++) {
            for (int secondArrayIndex = arrayIndex + 1; secondArrayIndex < inputNumberArray.size(); secondArrayIndex++) {
                if (inputNumberArray.get(arrayIndex).equals(inputNumberArray.get(secondArrayIndex))) {
                    return "Wrong Input, input Again";
                }
            }
        }

        for (int i = 0; i < inputNumberArray.size(); i++) {
            if (inputNumberArray.get(i).equals(randomNumberArray.get(i))) {
                aValue += 1;
            } else {
                if (randomNumberArray.contains(inputNumberArray.get(i))) {
                    bValue += 1;
                }
            }
        }
        result = aValue + "A" + bValue + "B";
        return result;
    }

    }
}
