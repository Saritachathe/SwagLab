package Utility;

import java.io.File;

import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenShot 
{
		public static void takesScreenShot(WebDriver driver,String Name) throws IOException 
		{
			File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File Destination = new File("C:\\Users\\Admin\\eclipse-workspace\\SwagLab\\ScreenShot\\" +Name+ ".jpg");
			FileHandler.copy(Source, Destination);
		}

	
	
}
