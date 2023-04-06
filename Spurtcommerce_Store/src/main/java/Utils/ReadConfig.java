package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;

	public ReadConfig() {
		File file = new File("./configuration/config.properties");

		try {
			FileInputStream src = new FileInputStream(file);
			pro = new Properties();
			pro.load(src);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String storeUrl() {
		
		String url=pro.getProperty("storeUrl");
		return url;
		
	}
	
public String storeUname() {
		
		String uName=pro.getProperty("storeUname");
		return uName;
		
	}

public String storePwd() {
	
	String storePwd=pro.getProperty("storePword");
	return storePwd;
	
}

public String getBrowser() {
	
	String browser=pro.getProperty("browser");
	return browser;
	
}

}
