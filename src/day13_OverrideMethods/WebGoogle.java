package day13_OverrideMethods;

public class WebGoogle extends WebEngine {
@Override	
		public void look(String item) {
			System.out.println("Looking for Google search:" + item);
	}
}
