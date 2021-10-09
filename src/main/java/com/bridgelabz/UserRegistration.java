package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public  boolean firstname(String firstName) {
        String first_name_pattern = "^[A-Z]{1}[a-z A-Z]{2,}$";
        Pattern pattern = Pattern.compile(first_name_pattern);
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()) {
            System.out.println("The Given First Name Is Valid");
        } else {
            System.out.println("The Given First Name Is Not Valid");
        }
        return matcher.matches();
    }

    public boolean lastname(String lastName) {
        String last_name_pattern = "^[A-Z]{1}[a-z A-Z]{2,}$";
        Pattern pattern = Pattern.compile(last_name_pattern);
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()) {
            System.out.println("The Given Last Name Is Valid");
        } else {
            System.out.println("The Given Last Name Is Not Valid");
        }
        return matcher.matches();
    }

    public boolean phoneNum(String phonenum) {
        String phoneNum_pattern = "^91 [1-9][0-9]{9}";
        Pattern pattern = Pattern.compile(phoneNum_pattern);
        Matcher matcher = pattern.matcher(phonenum);
        if (matcher.matches()) {
            System.out.println("The Given Phone Number Is Valid");
        } else {
            System.out.println("The Given Phone Number Is Not Valid");
        }
        return matcher.matches();
    }

    public boolean passWord(String password) {
        String passWord_pattern = "[a-z A-Z]{8,}$";
        Pattern pattern = Pattern.compile(passWord_pattern);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("The Given passWord Is Valid");
        } else {
            System.out.println("The Given passWord Is Not Valid");
        }
        return matcher.matches();
    }

    public boolean uppercasePassWord(String password) {
        String uppercasePassWord_pattern = "((?=.*[A-Z]))[a-z A-Z].{7,}$";
        Pattern pattern = Pattern.compile(uppercasePassWord_pattern);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("The Given Uppercase passWord Is Valid");
        } else {
            System.out.println("The Given Uppercase passWord Is Not Valid");
        }
        return matcher.matches();
    }

    public boolean numericPassWord(String password) {
        String numericPassWord_pattern = "(?=.*[0-9])(?=.*[A-Z])[a-z A-Z].{7,}$";
        Pattern pattern = Pattern.compile(numericPassWord_pattern);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("The Given Numeric passWord Is Valid");
        } else {
            System.out.println("The Given Numeric passWord Is Not Valid");
        }
        return matcher.matches();
    }

    public boolean specialCharacterPassWord(String password) {
        String specialCharacterPassWord_pattern = "(?=.*[$@%&!*?])(?=.*[0-9])(?=.*[A-Z])[a-z A-Z].{7,}$";
        Pattern pattern = Pattern.compile(specialCharacterPassWord_pattern);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("The Given Special Character passWord Is Valid");
        } else {
            System.out.println("The Given Special Character  passWord Is Not Valid");
        }
        return matcher.matches();
    }

    public boolean eMail(String email) {
        String email_pattern = "^[a-zA-Z0-9]+[-.+]?[a-z0-9]*@[a-z0-9]+[.][a-z]{2,3}[.]?[a-z]{0,3}$";
        Pattern pattern = Pattern.compile(email_pattern);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("The Given email Is Valid");
        } else {
            System.out.println("The Given email Is Not Valid");
        }
        return matcher.matches();
    }
}