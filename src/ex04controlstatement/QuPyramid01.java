package ex04controlstatement;


public class QuPyramid01 {


	public static void main(String[] args) {
		
		int x = 1;
		while (x <=5) {
			int y = 1;
			while (y<=5) {
				if(x>=y) {
					System.out.print("*");
				}
				else {
					System.out.print(""); 
				}
				y++;
			}
			System.out.println(); 
			x++;
		}
		
	}


}

