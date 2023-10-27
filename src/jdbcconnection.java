import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class jdbcconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		String host = "localhost";
		String port = "3306";

		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/demo", "crosshawk",
				"bREW4ane");

		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("SELECT * FROM credentials WHERE scenario = 'rewardscard'");

		while (rs.next())
		{
			driver.get("https://login.salesforce.com/");
			driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(rs.getString("username"));
			driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(rs.getString("password"));
		}

	}

}
