package com.oocl;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;
import java.io.IOException;

import static javafx.beans.binding.Bindings.when;

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
}