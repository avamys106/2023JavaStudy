package test;

public class Pryamid {

	public static void main(String[] args) {

		for(int x=1 ; x<=5; x++) {
			for(int y=5 ; y>x; y--) {
				System.out.print(" ");
			}
			for(int z=1 ; z<=x*2-1; z++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
