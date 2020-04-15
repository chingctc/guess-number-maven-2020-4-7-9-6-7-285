package com.oocl;

public class MainApp {

    public static final String CORRECT_ANSWER_MSG = "4A0B";
    public static final int MAX_NUMBER_OF_TRIAL = 6;

    public static void main(String[] args) {
        int count = 0;
        String result = "";
        String userInput = "";
        GuessNumberLogic guessNumberLogic = new GuessNumberLogic();
        RandomAnswerGenerator randomAnswerGenerator = new RandomAnswerGenerator();
        guessNumberLogic.randomNumberArray = randomAnswerGenerator.generate();
        ConsoleInputReader inputReader = new ConsoleInputReader();
        do {
            userInput = inputReader.getInput();
            result = guessNumberLogic.checkCorrectNumberAndPosition(userInput);
            System.out.println(result);
            count++;
        } while (!CORRECT_ANSWER_MSG.equals(result) && count <= MAX_NUMBER_OF_TRIAL);
    }
}
