package com.oocl;

public class MainApp {
    public static void main(String[] args) {
        int count = 0;
        String result = "";
        String userInput = "";
        App app = new App();
        ConsoleInputReader inputReader = new ConsoleInputReader();
        do {
            userInput = inputReader.getInput();
            result = app.checkCorrectNumberAndPosition(userInput);
            System.out.println(result);
            count++;
        } while (!"4A0B".equals(result) && count <= 6);
    }
}
