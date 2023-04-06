package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	
	public  ReadConfig() {
		File src=new File("./configuration/config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
			
		} catch (Exception e) {
			System.out.println("file not found"+e.getMessage());
		}
	}
	
	public String getURL() {
		String basURL=pro.getProperty("url");
		return basURL;
	}
	public String getUserName() {
		String uName=pro.getProperty("username");
		return uName;
	}
	
	public String getPwd() {
		String pwd=pro.getProperty("password");
		return pwd;
	}
	
	public String getChromePath() {
		String chromePath=pro.getProperty("chromepath");
		return chromePath;
	}
	
	public String getEdgePath() {
		String edgePath=pro.getProperty("edgepath");
		return edgePath;
	}
	
	public String getFireFoxPath() {
		String fireFoxPath=pro.getProperty("firefoxpath");
		return fireFoxPath;
	}
	
	public String getBrowser() {
		String chromeBrowser=pro.getProperty("browser");
		return chromeBrowser;
	}

	public String getAdminUrl() {
		String adminUrl = pro.getProperty("adminUrl");
		return adminUrl;

	}

	public String getAdminPword() {
		String adminpword = pro.getProperty("adminpword");
		return adminpword;

	}

	public String getAdminUname() {
		String adminuserName = pro.getProperty("adminuserName");
		return adminuserName;

	}


}
