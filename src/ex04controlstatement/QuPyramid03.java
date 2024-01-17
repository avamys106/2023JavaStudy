package ex04controlstatement;

public class QuPyramid03 {

	public static void main(String[] args) {

		int a = 5;
		for(int x=1 ; x<=a ; x++) {
			for(int y=0 ; y<a-x ; y++) {
				System.out.print(" ");
			}
			for(int z=1 ; z<x*2 ; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
