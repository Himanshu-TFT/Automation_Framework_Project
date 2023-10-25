package project.Utilities;

import project.base.BaseClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
    static Properties prop = new Properties();
    static String projectPath= System.getProperty("user.dir");


    public PropertiesFile(){
        try{
            InputStream input= new FileInputStream(projectPath+"/config/config.properties");
            prop.load(input);

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }

    }

    public void setProp(String value, String name){

        try{
            OutputStream output= new FileOutputStream(projectPath+"/config/config.properties");
            prop.setProperty(value,name);
            prop.store(output,null);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }

    }

    public String getURL(){
        return  prop.getProperty("url");
    }

    public String getUserName(){
        return prop.getProperty("user");
    }
    public String getPassword(){
        return prop.getProperty("password");
    }
}
