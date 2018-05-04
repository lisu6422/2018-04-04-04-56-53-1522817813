package com.thoughtworks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzGameTest {

    private FizzBuzzGame game;

    @Before
    public void setup(){
        this.game = new FizzBuzzGame();
    }

    @Test
    public void should_return_Fizz_when_have_3() {
        FizzBuzzGame game = new FizzBuzzGame();
        Assert.assertEquals("Fizz",game.get(3));
        Assert.assertEquals("Fizz",game.get(13));
        Assert.assertEquals("Fizz",game.get(30));
        Assert.assertEquals("Fizz",game.get(43));
    }

    @Test
    public void should_return_Fizz_when_not_have_3_and_only_times_3(){
        Assert.assertEquals("Fizz",game.get(9));
        Assert.assertEquals("Fizz",game.get(24));
        Assert.assertEquals("Fizz",game.get(48));
    }

    @Test
    public void should_return_Buzz_when_not_have_3_and_only_times_5(){
        Assert.assertEquals("Buzz",game.get(5));
        Assert.assertEquals("Buzz",game.get(25));
        Assert.assertEquals("Buzz",game.get(50));
        Assert.assertEquals("Buzz",game.get(55));
        Assert.assertEquals("Buzz",game.get(65));
        Assert.assertEquals("Buzz",game.get(80));
        Assert.assertEquals("Buzz",game.get(85));
        Assert.assertEquals("Buzz",game.get(95));
    }

    @Test
    public void should_return_Whizz_when_not_have_3_and_only_times_7(){
        Assert.assertEquals("Whizz",game.get(7));
        Assert.assertEquals("Whizz",game.get(14));
        Assert.assertEquals("Whizz",game.get(28));
        Assert.assertEquals("Whizz",game.get(49));
        Assert.assertEquals("Whizz",game.get(56));
        Assert.assertEquals("Whizz",game.get(77));
        Assert.assertEquals("Whizz",game.get(91));
    }

    @Test
    public void should_return_FizzBuzz_when_not_have_3_and_times_3_and_5(){
        Assert.assertEquals("FizzBuzz",game.get(15));
        Assert.assertEquals("FizzBuzz",game.get(45));
        Assert.assertEquals("FizzBuzz",game.get(60));
        Assert.assertEquals("FizzBuzz",game.get(75));
        Assert.assertEquals("FizzBuzz",game.get(90));
    }
    @Test
    public void should_return_FizzWhizz_when_not_have_3_and_times_3_and_7(){
        Assert.assertEquals("FizzWhizz",game.get(21));
        Assert.assertEquals("FizzWhizz",game.get(42));
        Assert.assertEquals("FizzWhizz",game.get(84));
    }

    @Test
    public void should_return_BuzzWhizz_when_not_have_3_and_times_5_and_7(){
        Assert.assertEquals("BuzzWhizz",game.get(70));
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_not_have_3_and_times_3_and_5_and_7(){
        Assert.assertEquals("FizzBuzzWhizz",game.get(105));
    }

}
