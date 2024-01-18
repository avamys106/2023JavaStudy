package ex04controlstatement;
//문제4) 다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오.

//파일명 : QuPyramid04.java
//실행결과]
//*
//* *
//* * *
//* * * *
//* * * * *
//* * * * 
//* * * 
//* * 
//* 

public class QuPyramid04 {

	public static void main(String[] args) {

		int a = 5;
		int num = 1;
		String star = "*";
		for (int x = 1; x <= 9; x++) {
			for (int y = 1; y <= x; y++) {
				if (x < a) {
					System.out.print("*");
				} else if (x == a){
					System.out.print("*");
				} 
			}
			System.out.println();
		}
	}
}
