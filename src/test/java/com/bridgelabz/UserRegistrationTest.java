package com.bridgelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class UserRegistrationTest {
    @Test
    public void givenFirstname_When_Valid_ShouldReturn_True() {
        UserRegistration nameValidation = new UserRegistration();
        try {
            boolean result = nameValidation.firstname("Shivraj");
            if (result) {
                assertTrue(result);
            } else {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID_NAME, "Enter Correct First Name");
            }
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenLastname_When_Valid_ShouldReturn_True() {
        UserRegistration nameValidation = new UserRegistration();
        try {
            boolean result = nameValidation.lastname("Jadhav");
            if (result) {
                assertTrue(result);
            } else {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID_NAME, "Enter Correct Last Name");
            }
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPhoneNumber_When_Valid_ShouldReturn_True() {
        UserRegistration phoneValidation = new UserRegistration();
        try {
            boolean result = phoneValidation.phoneNum("9222583656");
            if (result) {
                assertTrue((result));
            } else {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID_PHONE_NUMBER, "Enter Correct Phone Number");
            }
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPassWord_When_Valid_ShouldReturn_True() {
        UserRegistration passWordValidation = new UserRegistration();
        try {
            boolean result = passWordValidation.passWord("SHIVRAJJADHAV");
            if (result) {
                assertTrue(result);
            } else {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID_PASSWORD, "Enter Correct Password");
            }
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenUppercasePassWord_When_Valid_ShouldReturn_True() {
        UserRegistration passWordValidation = new UserRegistration();
        try {
            boolean result = passWordValidation.uppercasePassWord("shivJaDh");
            if (result) {
                assertTrue(result);
            } else {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID_PASSWORD, "Enter Correct Password");
            }
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenNumericPassWord_When_Valid_ShouldReturn_True() {
        UserRegistration passWordValidation = new UserRegistration();
        try {
            boolean result = passWordValidation.numericPassWord("Shiv28j");
            if (result) {
                assertTrue(result);
            } else {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID_PASSWORD, "Enter Correct Password");
            }
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenSpecialCharPassWord_When_Valid_ShouldReturn_True() {
        UserRegistration passWordValidation = new UserRegistration();
        try {
            boolean result = passWordValidation.specialCharacterPassWord("Shiv@123");
            if (result) {
                assertTrue(result);
            } else {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID_PASSWORD, "Enter Correct Password");
            }
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail_When_Valid_ShouldReturn_True() {
        UserRegistration emailValidation = new UserRegistration();
        try {
            boolean result = emailValidation.eMail("shivjadhav2806@.com");
            if (result) {
                assertTrue(result);
            }else {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID_EMAIL,"Enter Correct Email");
            }
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
}

}