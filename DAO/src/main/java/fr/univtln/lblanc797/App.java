package fr.univtln.lblanc797;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{

    private static final Properties properties = new Properties();

    static void loadProperties(String fileName) throws IOException {
        InputStream inputstream = App.class.getClassLoader().getResourceAsStream(fileName);
        if (inputstream == null) throw new FileNotFoundException();
        properties.load(inputstream);
    }

    public static String getProperty(String s){
        return properties.getProperty(s);
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
