package ru.netology.service;

import org.testng.Assert;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

        CashbackHackService service = new CashbackHackService();
        @org.testng.annotations.Test
        public void testBelowTheMinimumAmount() {

            int amount = 900;
            int actual = service.remain(amount);
            int expected = 100;

            Assert.assertEquals(expected,actual);
        }
    @org.testng.annotations.Test
        public void testMoreTheMinimumAmount() {
            int amount = 1100;
            int actual = service.remain(amount);
            int expected = 0;

            Assert.assertEquals(expected,actual);
        }

    @org.testng.annotations.Test
        public void testEqualsTheMinimumAmount() {
            int amount = 1000;
            int actual = service.remain(amount);
            int expected = 0;

            Assert.assertEquals(expected,actual);
        }

    @org.testng.annotations.Test
        public void testBelowOneTheMinimumAmount() {

            int amount = 999;
            int actual = service.remain(amount);
            int expected = 1;

            Assert.assertEquals(expected,actual);
        }

    @org.testng.annotations.Test
        public void testAmountEqualZero() {

            int amount = 0;
            int actual = service.remain(amount);
            int expected = 1000;

            Assert.assertEquals(expected,actual);
        }
    }
