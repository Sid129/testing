package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      System.out.println("Perfect");
      System.out.println("yes");
      String value = System.getenv("NAME");
      System.out.println("yess");
      System.out.println("variable= "+value);
      FileInputStream config= new FileInputStream("./config.properties");
  	 Properties prop=new Properties();
  	 prop.load(config);	
     String url=prop.getProperty("Name");
     System.out.println("Plugin"+url);
	}

}
