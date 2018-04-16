package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzGameTest {
    @Test
    public void should_return_Fizz_when_have_3() {
        FizzBuzzGame game = new FizzBuzzGame();
        Assert.assertEquals("Fizz",game.get(3));
        Assert.assertEquals("Fizz",game.get(13));
        Assert.assertEquals("Fizz",game.get(30));
        Assert.assertEquals("Fizz",game.get(43));
    }
}
