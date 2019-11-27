package com.techtorial;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class homeWorkReadFromFile {


    public static void main(String[] args) throws IOException {

        File homework=new File("src/test/resources/credentials.properties");

        FileReader fileReader=new FileReader(homework);

        Properties properties=new Properties();

        properties.load(fileReader);

        String excistingLogin=properties.getProperty("login1");
        if(excistingLogin == properties.getProperty("login1")) {

            System.out.println("your exicting login from properties file is : "+excistingLogin);
        }else {
            System.out.println("Sorry no such key in properties file ");

        }


        String excistingPassword=properties.getProperty("password1");
        if(excistingPassword == properties.getProperty("password1")) {

            System.out.println("your exicting password from properties file is : "+excistingPassword);
        }else {
            System.out.println("Sorry no such key in properties file ");

        }

        String SecondExLogin=properties.getProperty("login2");
        if(SecondExLogin == properties.getProperty("login2")) {

            System.out.println("your second exicting login from properties file is : "+SecondExLogin);
        }else {
            System.out.println("Sorry no such key in properties file ");

        }


        String SecondExcistingPassword=properties.getProperty("password2");
        if(SecondExcistingPassword == properties.getProperty("password2")) {

            System.out.println("your second exicting password from properties file is : "+SecondExcistingPassword);
        }else {
            System.out.println("Sorry no such key in properties file ");

        }

        System.out.println("All your keys are: " +properties.stringPropertyNames());

    }
}
