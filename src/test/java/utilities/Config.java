package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static Properties properties;

    static {
        try {
            properties = new Properties();
            FileInputStream file = new FileInputStream("src/test/resources/configuration.properties");
            properties.load(file);
        } catch (IOException e) {
            System.out.println("File not found");
        }

    }

    public static String getValue(String key) {
        return properties.getProperty(key);
    }

    public static String data(String key){
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/test/resources/configuration.properties");
            properties.load(fileInputStream);
            fileInputStream.close();
        }catch (IOException e){
            System.out.println("not found");
        }
        return properties.getProperty(key);
    }

}

