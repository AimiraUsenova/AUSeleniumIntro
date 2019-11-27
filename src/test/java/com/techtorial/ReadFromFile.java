package com.techtorial;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadFromFile {

    public static void main(String[] args) throws IOException {
        //specify the needed file
        File credsFile=new File("src/test/resources/credentials.properties");

        //read from a file
        FileReader fileReader=new FileReader(credsFile);

        Properties properties=new Properties();

        properties.load(fileReader);
        //as simple as using properties class

        String login=properties.getProperty("login");
        System.out.println("my login from properties file is : "+login);

        String password=properties.getProperty("password");
        System.out.println("my password from properties file is : "+password);

        String url=properties.getProperty("url");
        System.out.println("my url from properties file is : "+url);

        System.out.println(properties.stringPropertyNames());

    }


    public static String getProperties(String key) throws IOException {

        File credsFile=new File("src/test/resources/credentials.properties");
        //we say a java that we have a file and giving to him location of our file

        //read from a file
        FileReader fileReader=new FileReader(credsFile);
        //and ask this file read everything from this file

        Properties properties=new Properties();
        properties.load(fileReader);

        String value=properties.getProperty(key);
        return value;

    }
}
