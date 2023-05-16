package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    @org.junit.Test
    public void testBelowTheMinimumAmount() {

        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(expected,actual);
    }
    @org.junit.Test
    public void testMoreTheMinimumAmount() {
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void testEqualsTheMinimumAmount() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void testBelowOneTheMinimumAmount() {

        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;

        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void testAmountEqualZero() {

        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(expected,actual);
    }
}