package com.example;

import java.util.ArrayList;
import java.util.stream.Collectors;

class Main{
	public void myPublic() {
		
	}
	private void myPrivate() {
		
	}
	class Nested{
		public void nestedMethod() {
			myPrivate();
		}
	}
}


public class StringChanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("".isBlank());
		String s="Vishal";
		System.out.println(s.isBlank());
		
		String str="Jahnavi\nRiqa\nSupriya";
		System.out.println(str);
		System.out.println(str.lines().collect(Collectors.toList()));
		
		String str1="    Nishith    ";
		System.out.println(str1.strip());
		
		System.out.print("strat");
		System.out.print(str1.strip());
		System.out.print("end");
		
		System.out.print("strat");
		System.out.print(str1.stripLeading());
		System.out.print("end");
		
		System.out.println();
		System.out.print("strat");
		System.out.print(str1.stripTrailing());
		System.out.print("end");
		
		var list=new ArrayList<String>();
		
		
		
		String str2 = "Prem".repeat(5);
		System.out.println(str2);
		
		
		
	}
	

}
