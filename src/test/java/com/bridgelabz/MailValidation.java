package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;

@RunWith(Parameterized.class)
public class MailValidation {

    public boolean expected;
    public String mail;
    public  UserRegistration user;

    @Before
    public void initialize(){
        user=new UserRegistration();
    }

    public MailValidation(boolean expected,String mail){
        this.expected=expected;
        this.mail=mail;
    }

    @Parameterized.Parameters
    public static Iterable<Object> data(){
        return Arrays.asList(new Object[][]{
                {true,"shiv@gmail.com"},
                {true,"shiv.jadhav@gmail.in"},
                {false,"shiv.@gmail.com"},
                {false,"shiv@gmail."}

        });
    }

    @Test
    public void name(){
        Assert.assertEquals(expected,user.eMail(mail));
    }
}