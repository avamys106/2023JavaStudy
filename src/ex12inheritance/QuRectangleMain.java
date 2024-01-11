package ex12inheritance;

class Rectangle {
     
	int width;
	int height;
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	void showAreaInfo() {
		System.out.println("직사각형 면적: "+ (width * height));
	}
} 
class Square extends Rectangle {
	/* 직사각형은 가로, 세로 두 변의 길이가 서로 다르기때문에 2개의
	멤버변수가 필요하다. 하지만 정사각형은 길이가 동일하므로 1개의 값으로
	2개의 멤버변수를 초기화 할 수 있다.
	즉 해당 클래스는 멤버변수의 확장이 필요하지 않다. */
	public Square(int total) {
		super(total, total);
	}
	
	@Override
	void showAreaInfo() {
		System.out.println("정사각형 면적: "+ (super.width * super.height));
	}
	
} 
class QuRectangleMain {
	public static void main(String[] args) {
	       	Rectangle rec = new Rectangle(4, 8);
	       	rec.showAreaInfo();

     		Square sqr = new Square(12);
	       	sqr.showAreaInfo();
 	}
}

