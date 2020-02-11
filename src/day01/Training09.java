package day01;

public class Training09 {

	public static void main(String[] args) {
	String msg = new String ("Sender:<Shaun Smith>. From Number:[312-123-3456]. Message:{I love programing and problem solving. Java is fun}");
	
	String sender = msg.substring(msg.indexOf('<')+1, msg.indexOf(">"));
	String num = msg.substring(msg.indexOf('[')+1, msg.indexOf("]"));
	String message = msg.substring(msg.indexOf('{')+1, msg.indexOf("}"));
	System.out.println(sender);
	System.out.println(num);
	System.out.println(message);
	}

}
