package com.qa.Util;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class ConfigReader {

	//properties file
	
	private Properties prop;
	
	public Properties inint_prop() throws IOException {
		prop=new Properties();
		
	try {
		FileInputStream ip=new FileInputStream("src/test/resources/config/config.properties");
		prop.load(ip);
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	return prop;
		
	}
}
