package com.oocl;

import java.util.Scanner;

public class ConsoleInputReader implements InputReader {
    @Override
    public String getInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please input a 4-digit number: ");
        String inputNumber = in.nextLine();
        return inputNumber;
    }
}
