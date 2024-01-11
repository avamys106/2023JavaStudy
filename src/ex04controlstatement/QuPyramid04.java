package ex04controlstatement;

public class QuPyramid04 {

	public static void main(String[] args) {
		
		for(int x=0 ; x<=9 ; x++) {
			for(int y=0 ; y<9-x ; y++) {
				System.out.print("*");
			}
			for(int y=0 ; y<5-x ; y++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
