package ex04controlstatement;

public class ControlTest {

	public static void main(String[] args) {

		for (int i = 2; i <= 9; i++) {
			for (int x = 1; x <= 9; x++) {
				System.out.println(i + "x" + x + "=" + (i*x));
			}
		}
	}

}
