package Abstraction;

public class Abstraction_demo2 extends Abstractiondemo1 {

	@Override
	void SBI() {
		System.out.println("SBI");		
	}
	public static void main (String args[]) {
		Abstraction_demo2 a = new Abstraction_demo2();
		a.Axis();
		a.SBI();
	}
	

}
