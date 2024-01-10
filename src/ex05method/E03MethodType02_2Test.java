package ex05method;

import java.util.Scanner;

public class E03MethodType02_2Test {

	static String score() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어점수:");
		int kor = scanner.nextInt();
		System.out.println("영어점수:");
		int eng = scanner.nextInt();
		System.out.println("수학점수:");
		int math = scanner.nextInt();
		
		double avg = (kor + eng + math) / 3.0;
		String text = "";
		int result = (int)avg / 10;
		switch (result) {
		case 10: case 9: 
			text = "A학점";
			break;
		case 8: 
			text = "B학점";
			break;
		case 7: 
			text = "C학점";
			break;
		case 6: 
			text = "D학점";
			break;
		default: 
			text = "F학점";
		}
		return text;
	}

	public static void main(String[] args) {
//		System.out.println(score.r());
		System.out.println("당신의 학점은 "+ score() +" 입니다");
	}

}
