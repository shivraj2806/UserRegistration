package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public  boolean firstname(String firstName) {
        String first_name_pattern = "^[A-Z]{1}[a-z A-Z]{2,}$";
        Pattern pattern = Pattern.compile(first_name_pattern);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
}

