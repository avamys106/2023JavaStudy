package ex08class;
//클래스(틀) 추상화
class Computer {
	//멤버변수(속성)
	String CPU;
	String RAM;
	String products;
	//멤버메서드
	void playMP3() {}
	void playMovie() {}
	void calculator() {}
	//초기화 담당 메서드
	void init()	{
		CPU = "고정된";
		RAM = "값으로만";
		products = "초기화가능";
	}
	//초기화 담당 메서드2(매개변수 있는 상태)
	void init(String c, String r, String p) {
		CPU = c;
		RAM = r;
		products = p;
	}
	
}
public class test {

	public static void main(String[] args) {

		Computer com1 = new Computer();
		com1.products = "삼성";
		com1.CPU = "xxxx";
		com1.RAM = "yyyy";
		System.out.println(com1.products);
		
		Computer com2 = new Computer();
		com2.init();
		
		Computer com3 = new Computer();
		com3.init("LG", "AAA", "BBB");
	}

}
