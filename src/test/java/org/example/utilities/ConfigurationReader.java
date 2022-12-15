package org.example.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();

    static {

        //codes

    }


    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }


}
