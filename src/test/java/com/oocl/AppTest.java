package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void should_return_value_for_all_correct_number_and_correct_position_4A0B() {
        App app = new App();
        String inputValue = "1234";
        Assert.assertEquals("4A0B",app.checkCorrectNumberAndPosition(inputValue));
    }

    @Test
    public void should_return_value_for_correct_number_wrong_position_0A4B() {
        App app = new App();
        String inputValue = "4321";
        Assert.assertEquals("0A4B", app.checkCorrectNumberAndPosition(inputValue));
    }

    @Test
    public void should_return_value_for_partially_correct_number_and_partially_correct_position_1A1B() {
        App app = new App();
        String inputValue = "0354";
        Assert.assertEquals("1A1B", app.checkCorrectNumberAndPosition(inputValue));
    }

    @Test
    public void should_return_value_for_all_correct_number_and_partially_correct_position_2A2B() {
        App app = new App();
        String inputValue = "2134";
        Assert.assertEquals("2A2B", app.checkCorrectNumberAndPosition(inputValue));
    }

    @Test
    public void should_return_value_for_partially_correct_number_and_all_wrong_position_0A2B() {
        App app = new App();
        String inputValue = "0347";
        Assert.assertEquals("0A2B", app.checkCorrectNumberAndPosition(inputValue));
    }

    @Test
    public void should_return_value_for_all_wrong_number_and_all_wrong_position_0A0B() {
        App app = new App();
        String inputValue = "6789";
        Assert.assertEquals("0A0B", app.checkCorrectNumberAndPosition(inputValue));
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