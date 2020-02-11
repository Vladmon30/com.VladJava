package day02;

import java.util.ArrayList;
import java.util.List;

public class Obj_Creat_Student {


	
	
	public static void main(String[] args) {
		
		Obj_Creat_Student student = new Obj_Creat_Student();
		
		student.study();
		student.study("JAVA");
		student.study(5);


	}
	
	private void study() {
		System.out.println("student is study");	
	}
	
	private void study(String topic) {
		System.out.println("the topic is " + topic);
	}
	
	private int study(int i) {
		int res = i*2;
		System.out.println("student study "+res+" hours");
		return res;
		
		
	}

}
