package week1.day2;

public class Browser {
	String launchBrowser(String browserName){
		System.out.println("Browser launched successfully");
		return browserName;
	}
	void loadUrl(){
		System.out.println("Application Url loaded successfully");
	}
	public static void main(String[] args) {
		Browser b=new Browser();
		b.launchBrowser("chrome");
		b.loadUrl();
		
	}
}
