package entireSDET;

import org.openqa.selenium.WebDriver;

public class Properties {
	
	public static WebDriver driver;
	
	public static String url = "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F";
	
	public static String emailID = "admin@yourstore.com";
	public static String password = "admin";
	
	public static String emailIDNeg = "admin@yourstore.";
	public static String passwordNeg = "admn";
	
	public static String ncLoginPageTitle = "Your store. Login";
	public static String ncDashboardPageTitle = "Dashboard / nopCommerce administration";
	public static String ncOrdersPageTitle = "";
	
	public String orderStatuses = "Pending"; //ncOrdersPageOrderStatusesfield
	public String warehouseopt1 = "All";
	public String warehouseopt2 = "Warehouse 1 (New York)";

}
