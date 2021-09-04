package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {
    public void givenFirstname_When_Valid_ShouldReturn_True() {
        UserRegistration nameValidation = new UserRegistration();
        boolean result = nameValidation.firstname("Shivraj");
        assertTrue(result);
    }
}