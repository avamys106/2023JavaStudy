package ex05method;

public class E02MethodType01Test {

	static void menuPrint() {
		System.out.println("==메뉴선택==");
		System.out.println("1.열기, 2.계속하기, 3.종료");
		System.out.println("======================");
	}
	
	
	static void valueChack(int x) {
		int value = x;
		
		if(value%2==0) {
			System.out.println(value + "는 짝수입니다.");
			return;
		}
		System.out.println(value + "는 홀수입니다.");
	}
	public static void main(String[] args) {
		menuPrint();
		valueChack(10);
	}

}
