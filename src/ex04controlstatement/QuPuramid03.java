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

		for (int x=1 ; x<=5 ; x++) {
			for (int y=1 ; y<=5 ; y++) {
				System.out.print("*");
				x++;
			}
			System.out.println("*");
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