package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;
class UserRegistrationTest {
    @Test
    public void givenFirstname_When_Valid_ShouldReturn_True() {
        UserRegistration nameValidation = new UserRegistration();
        boolean result = nameValidation.firstname("Shivraj");
        assertTrue(result);
    }

    @Test
    public void givenLastname_When_Valid_ShouldReturn_True() {
        UserRegistration nameValidation = new UserRegistration();
        boolean result = nameValidation.lastname("Jadhav");
        assertTrue(result);
    }
    @Test
    public void givenPhoneNum_When_Valid_ShouldReturn_True() {
        UserRegistration nameValidation = new UserRegistration();
        boolean result = nameValidation.phoneNum("943685256");
        assertTrue(result);
    }

    @Test
    public void givenPassWord_When_Valid_ShouldReturn_True() {
        UserRegistration nameValidation = new UserRegistration();
        boolean result = nameValidation.passWord("Shiv");
        assertTrue(result);
    }
    @Test
    public void givenUppercasePassWord_When_Valid_ShouldReturn_True() {
        UserRegistration nameValidation = new UserRegistration();
        boolean result = nameValidation.uppercasePassWord("SHIVRAJ");
        assertTrue(result);
    }
    @Test
    public void givenNumeric_PassWord_When_Valid_ShouldReturn_True() {
        UserRegistration nameValidation = new UserRegistration();
        boolean result = nameValidation.numericPassWord("4444");
        assertTrue(result);
    }
    @Test
    public void givenSpecial_CharacterPassWord_When_Valid_ShouldReturn_True() {
        UserRegistration nameValidation = new UserRegistration();
        boolean result = nameValidation.specialCharacterPassWord("Mahi@07");
        assertTrue(result);
    }

}