package com.oocl;

import java.util.Scanner;

public class ConsoleInputReader implements InputReader {

    public static final String ASK_FOR_INPUT_MESSAGE = "Please input a 4-digit number: ";

    @Override
    public String getInput() {
        Scanner inputValue = new Scanner(System.in);
        System.out.print(ASK_FOR_INPUT_MESSAGE);
        String inputNumber = inputValue.nextLine();
        return inputNumber;
    }
}
