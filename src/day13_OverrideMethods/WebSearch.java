package day13_OverrideMethods;

public class WebSearch {

	public static void main(String[] args) {
			WebEngine eng = new WebEngine();
				eng.look("Engine Test");	
			
			WebGoogle google = new WebGoogle();
				google.look("Google Test");
			
			WebAmazon amaz = new WebAmazon();
				amaz.look("Amazon Test");
	}

}
