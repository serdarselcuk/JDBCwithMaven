package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;


   static {

        if (properties == null){
           try {
               FileInputStream fileInputStream = new FileInputStream("src/configuration.properties");
               properties = new Properties();
               properties.load(fileInputStream);
               fileInputStream.close();

           } catch (IOException e) {
               e.printStackTrace();
           }
       }

    }

    public static String getConfig(String str){
        return properties.getProperty(str);
    }
}
