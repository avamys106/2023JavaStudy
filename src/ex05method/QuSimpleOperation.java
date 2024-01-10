package ex05method;

public class QuSimpleOperation {

	public static void arithmetic(int x, int y) {
		int plus = x+y;
		int minus = x-y;
		int multi = x*y;
		int division = x/y;
		int quotient = x%y;
		System.out.println("덧셈결과->"+ plus);
		System.out.println("뺄셈결과->"+ minus);
		System.out.println("곱셈결과->"+ multi);
		System.out.println("나눗셈 몫->"+ division);
		System.out.println("나눗셈 나머지->"+ quotient);
	}
	
	public static void main(String[] args) {
		
		arithmetic(100, 77);
	}

}
