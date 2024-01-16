package quiz;

import java.util.Random;
import java.util.Scanner;

class RPSgame {
	int scissors = 1;
	int rock = 2;
	int paper = 3;
	
}

public class QuRockPaperScissors {

	public static void main(String[] args) {

		System.out.println("무엇을 내겠습니까?(1:가위, 2:바위, 3:보)");
		System.out.print("선택(1,2,3 중 입력) : ");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();

		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			int computer = random.nextInt(3)+1;
			if (computer == 1) {
				System.out.println("컴퓨터의 선택은 : 가위");
			} else if (computer == 2) {
				System.out.println("컴퓨터의 선택은 : 바위");
			} else if (computer == 3){
				System.out.println("컴퓨터의 선택은 : 보자기");
			}
			switch (choice) {

			case 1:
				System.out.println("가위를 냈습니다.");
				break;
			case 2:
				System.out.println("바위를 냈습니다.");
				break;
			case 3:
				System.out.println("보자기를 냈습니다.");
				break;
			default:
				System.err.println("다시입력하세요");
			}
		}


				
//				if (random.nextInt(3 + 1) < choice) {
//					System.out.println("이겼습니다");
//				} else if (random.nextInt(3 + 1) == choice) {
//					System.out.println("비겼습니다");
//				} else if (random.nextInt(3 + 1) > choice) {
//					System.out.println("졌습니다");
//				}
//				return;
		}

	}

