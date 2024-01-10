package ex05method;

public class E03MethodType02_1Test {

	static int sumTest(int value, int value2) {
		int total = 0;
		int val2 = value2;
		for(int val = value ; val<=val2 ;val++) {
			total += val;
		}
		return total;
	}
	
	public static void main(String[] args) {

		System.out.println(sumTest(1,1000));
	}

}
