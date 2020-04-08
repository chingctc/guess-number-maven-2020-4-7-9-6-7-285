package com.oocl;

public class MainApp {
    public static void main(String[] args) {
        int count = 0;
        String result = "";
        App app = new App();
        do {
            result = app.checkCorrectNumberAndPosition();
            System.out.println(result);
            count++;
        } while (!"4A0B".equals(result) && count <= 6);
    }
}
