package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void should_return_value_for_all_correct_number_and_correct_position() {
        App app = new App();
        String inputValue = "1234";
        Assert.assertEquals("4A0B",app.checkCorrectNumberAndPosition(inputValue));
    }

    @Test
    public void should_return_value_for_partial_correct_number() {
        App app = new App();
        String inputValue = "1567";
        Assert.assertEquals("1A0B", app.checkCorrectNumberAndPosition(inputValue));
    }

    @Test
    public void should_return_value_for_correct_number_but_wrong_position() {
        App app = new App();
        String inputValue = "0324";
        Assert.assertEquals("1A2B", app.checkCorrectNumberAndPosition(inputValue));
    }

    @Test
    public void should_return_alert_message_when_input_less_than_4_digit() {
        App app = new App();
        String inputValue = "12";
        Assert.assertEquals("Wrong Input, input Again", app.checkCorrectNumberAndPosition(inputValue));
    }

    @Test
    public void should_return_alert_message_when_duplicate_value() {
        App app = new App();
        String inputValue = "1123";
        Assert.assertEquals("Wrong Input, input Again", app.checkCorrectNumberAndPosition(inputValue));
    }
}