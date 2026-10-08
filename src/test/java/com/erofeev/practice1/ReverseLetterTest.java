package com.erofeev.practice1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseLetterTest {

    @Test
    void reversesOnlyLetters_KeepsNumbersOrSymbols() {
        String string = "J@va the be$t!123";
        String result = "t@eb eht av$J!123";
        assertEquals(result, ReverseLetter.reverseLetters(string));
    }

    @Test
    void returnsUnchangedString_ifInputIsEmptyString() {
        String string = "";
        String result = "";
        assertEquals(result, ReverseLetter.reverseLetters(string));
    }

    @Test
    void returnsUnchangedString_ifInputIsSingleLetter() {
        String string = "a";
        String result = "a";
        assertEquals(result, ReverseLetter.reverseLetters(string));
    }

    @Test
    void returnsUnchangedString_ifInputHasNoLetters() {
        String string = "123 !@#";
        String result = "123 !@#";
        assertEquals(result, ReverseLetter.reverseLetters(string));
    }

    @Test
    void returnsReversedLetters_ifInputHasOnlyLetters() {
        String string = "abcd";
        String result = "dcba";
        assertEquals(result, ReverseLetter.reverseLetters(string));
    }

    @Test
    void keepsNonLetters_ifNonLettersAreFirstAndLastCharacters() {
        String string = "@abc!";
        String result = "@cba!";
        assertEquals(result, ReverseLetter.reverseLetters(string));
    }

    @Test
    void keepsNonLetter_ifNonLetterIsInExactMiddleOfString() {
        String string = "abc!def";
        String result = "fed!cba";
        assertEquals(result, ReverseLetter.reverseLetters(string));
    }

    @Test
    void reversesUppercaseAndLowercaseLetters() {
        String string = "ABCcba";
        String result = "abcCBA";
        assertEquals(result, ReverseLetter.reverseLetters(string));
    }

    @Test
    void returnsEmptyString_ifInputIsNull() {
        String string = null;
        String result = "";
        assertEquals(result, ReverseLetter.reverseLetters(string));
    }
}
