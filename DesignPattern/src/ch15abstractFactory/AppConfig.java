package ch15abstractFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public final class AppConfig {
	private static String fileName = "prop.properties";
	private static Properties prop = null;

	private AppConfig(){}
	
	//静态块
	static{
		
		//读取配置文件
		prop = new Properties();
		InputStream is = null;
		is = AppConfig.class.getClassLoader().getResourceAsStream(fileName);
		try {
			prop.load(new InputStreamReader(is, "UTF-8"));
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String getDB_type(){
		return prop.getProperty("database");
	}
}
