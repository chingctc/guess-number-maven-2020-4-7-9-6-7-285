package com.oocl;

import java.util.ArrayList;

public class App {
    public static final int DIGIT_NUMBER = 4;
    public static final String ANSWER_RESULT_PATTERN = "%sA%sB";
    public ArrayList<String> randomNumberArray = new ArrayList<String>();

    public String checkCorrectNumberAndPosition(String inputValue) {
        int aValue = 0;
        int bValue = 0;
        if (inputValue.length() != DIGIT_NUMBER) {
            return "Wrong Input, input Again";
        }

        ArrayList<String> inputNumberArray = extractInputNumberForComparison(inputValue);

        if (checkSelfDuplicate(inputNumberArray)) return "Wrong Input, input Again";

        for (int inputArrayIndex = 0; inputArrayIndex < inputNumberArray.size(); inputArrayIndex++) {
            if (inputNumberArray.get(inputArrayIndex).equals(randomNumberArray.get(inputArrayIndex))) {
                aValue += 1;
            } else {
                bValue = checkInputContainsAnyOfRandomNumber(bValue, inputNumberArray, inputArrayIndex);
            }
        }
        return String.format(ANSWER_RESULT_PATTERN, aValue, bValue);
    }

    private ArrayList<String> extractInputNumberForComparison(String inputValue) {
        ArrayList<String> inputNumberArray = new ArrayList<String>();
        for (int inputValueIndex = 0; inputValueIndex < inputValue.length(); inputValueIndex++) {
            inputNumberArray.add(String.valueOf(inputValue.charAt(inputValueIndex)));
        }
        return inputNumberArray;
    }

    private boolean checkSelfDuplicate(ArrayList<String> inputNumberArray) {
        for (int arrayIndex = 0; arrayIndex < inputNumberArray.size(); arrayIndex++) {
            if (checkInnerSelfDuplicate(inputNumberArray, arrayIndex)) return true;
        }
        return false;
    }

    private boolean checkInnerSelfDuplicate(ArrayList<String> inputNumberArray, int arrayIndex) {
        for (int secondArrayIndex = arrayIndex + 1; secondArrayIndex < inputNumberArray.size(); secondArrayIndex++) {
            if (inputNumberArray.get(arrayIndex).equals(inputNumberArray.get(secondArrayIndex))) {
                return true;
            }
        }
        return false;
    }

    private int checkInputContainsAnyOfRandomNumber(int bValue, ArrayList<String> inputNumberArray, int inputArrayIndex) {
        if (randomNumberArray.contains(inputNumberArray.get(inputArrayIndex))) {
            bValue += 1;
        }
        return bValue;
    }
}
