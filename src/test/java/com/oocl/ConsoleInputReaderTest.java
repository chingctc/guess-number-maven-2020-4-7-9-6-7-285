package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class ConsoleInputReaderTest {
    @Test
    public void should_return_user_input_from_console() {
        ConsoleInputReader inputReader = new ConsoleInputReader();
        String inputValue = "1234";
        InputStream in = new ByteArrayInputStream(inputValue.getBytes());
        System.setIn(in);
        String userInput = inputReader.getInput();
        Assert.assertEquals(inputValue, userInput);
    }

}