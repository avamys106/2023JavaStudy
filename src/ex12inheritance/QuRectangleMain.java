package ex12inheritance;

class Rectangle {
     
	int width;
	int height;
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	void showAreaInfo() {
		System.out.println("직사각형 면적: "+ width * height);
	}
} 
class Square extends Rectangle {
	
	public Square(int total) {
		super(total, total);
	}
	
	@Override
	void showAreaInfo() {
		System.out.println("정사각형 면적: "+ width * height);
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

