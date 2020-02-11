package oop_Encapsulat;

public class ClientInfoReader {
	public static void main(String[] args) {
		
		ClientInfo client = new ClientInfo();
				client.setPassport("ES350360");
				client.setSsn(800392489);
				client.name ="Vlad Mon";
				
		System.out.print(client.getAllInfo());
		
	}
}
