package Polymorphism;

public class Overriding_demo2 extends Overriding_demo1 {
	
	public void Add (int b) {
		System.out.println(b);
		
	}
	
	public static void main (String[] args) {
		Overriding_demo2 demo2 = new Overriding_demo2();
		Overriding_demo1 demo1 = new Overriding_demo1();
		demo1.Add(100);
		demo2.Add(200);
		
	}

}
