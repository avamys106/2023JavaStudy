package ex04controlstatement;

//문제3) 다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오.

//파일명 : QuPyramid03.java
//실행결과]
//         *
//       * * *
//     * * * * *
//   * * * * * * *
//* * * * * * * * *

public class QuPuramid03 {

	public static void main(String[] args) {

		int num = 5;

		for (int x = 0; x < num; x++) {
			for (int y = 1; y <= num - x; y++) {
				System.out.print(" ");
			}
			for (int z = 0; z < x * 2 + 1; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
//public class QuPuramid03 {
//
//	public static void main(String[] args) {
//
//		for(int x=1 ; x<=9 ; x++) {
//			for(int y=1 ; y<=9 ; y++) {
//				if(x%2 == 0) {
//					System.out.print("*");
//				} 
//			}
//			System.out.println();
//		}
//	}
//
//}