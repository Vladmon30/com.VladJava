package day13_OverrideMethods;

public class WebAmazon extends WebEngine {

	@Override
	public void look (String item) {
		System.out.println("Looking for Amazon:" + item);
	}
		
}
