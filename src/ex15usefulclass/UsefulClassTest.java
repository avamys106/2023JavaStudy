package ex15usefulclass;

public class UsefulClassTest {

	public static void main(String[] args) {
		
		for(int x=2 ; x<=9 ; x++) {
			System.out.println(x + " X " + 1 + " = " + x);
			for(int y=2 ; y<=9 ; y++) {
				String test = "X 2 ";
				System.out.println(x + " " + test + "= " +
					((int)Math.pow(x,y)));
			}
			System.out.println();
		}

	}

}
