package ex05method;

import java.util.Scanner;

public class E01MethodBasicTest {
	
	public static int simpleNum(int x, int y) {
		int sum = x + y;
		return sum;
	}

	public static void menuPrint() {
		System.out.println("당신의 이름은?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		namePrint(name);
	}
	
	public static void namePrint(String name) {
		System.out.println("제 이름은 "+ name +" 입니다");
	}
	public static void main(String[] args) {
		
		System.out.println(simpleNum(1, 2));
		menuPrint();
	}

}
