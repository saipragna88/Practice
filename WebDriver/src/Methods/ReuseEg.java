package Methods;

import java.io.IOException;


public class ReuseEg {

	public static void main(String[] args) throws IOException {
		
		
		BasicMethodsEg b=new BasicMethodsEg();
		b.BrowserLaunch("firefox","http://google.com");
		b.TakeScreenshot("C:\\SeleniumWorkspace\\WebDriver\\src\\screenshot\\google.png");
		

	}

}
