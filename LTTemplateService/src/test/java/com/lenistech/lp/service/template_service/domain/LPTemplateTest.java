package com.lenistech.lp.service.template_service.domain;

import org.junit.Test;
import static org.junit.Assert.*;

public class LPTemplateTest {
    @Test
    public void givenSameInstance_whenEquals_returnsTrue() {
        Example underTest = new Example("My name is: abc123");

        assertTrue("LPTemplate equals self", underTest.equals(underTest));
    }

    @Test
    public void givenOtherIsNull_whenEquals_returnsFalse() {
        Example underTest = new Example("My name is: abc123");

        assertFalse("LPTemplate equals null", underTest.equals(null));
    }

    @Test
    public void givenOtherIsDifferentType_whenEquals_returnsFalse() {
        Example underTest = new Example("My name is: abc123");

        assertFalse("LPTemplate equals String", underTest.equals(new String()));
    }

    @Test
    public void givenAName_whenGetLPTemplate_returnsCorrectResults() {
        Example underTest = new Example("My name is: abc123");

        assertEquals("LPTemplate name property should match.", "My name is: abc123", underTest.getName());
    }

    @Test
    public void givenTwoIdenticalObjects_whenEquals_returnsTrue() {
        Example underTest1 = new Example("My name is: abc123");
        Example underTest2 = new Example("My name is: abc123");

        assertTrue("Two identical objects should be equal.", underTest1.equals(underTest2));
    }

    @Test
    public void givenTwoDifferentObjects_whenEquals_returnsFalse() {
        Example underTest1 = new Example("My name is: 123abc");
        Example underTest2 = new Example("My name is: abc123");

        assertFalse("Two different objects should not be equal.", underTest1.equals(underTest2));
    }


    @Test
    public void givenTwoDifferentObjects_bothHaveDifferentHashCodes() {
        Example underTest1 = new Example("My name is: 123abc");
        Example underTest2 = new Example("My name is: abc123");

        assertNotEquals("Two different objects should have different hashcodes.", underTest1.hashCode(), underTest2.hashCode());
    }

    @Test
    public void givenTwoIdenticalObjects_bothHaveSameHashCodes() {
        Example underTest1 = new Example("My name is: abc123");
        Example underTest2 = new Example("My name is: abc123");

        assertEquals("Two identical objects should have the same hashcode.", underTest1.hashCode(), underTest2.hashCode());
    }

    @Test
    public void givenAnInstance_toString_returnsCorrectValue() {
        Example underTest = new Example("My name is: abc123");
        String actualValue = underTest.toString();

        assertTrue("toString() ActualValue:" + actualValue, actualValue.contains("name=My name is: abc123"));
    }
}
