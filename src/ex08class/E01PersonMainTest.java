package ex08class;

class Person2 {
	String name = "park";
	int age = 30;
	String gender = "남자";
	String job = "학생";
	
	void eat() {
		System.out.printf("%s가(이) 식사를 한다\n", name);
	}
	void sleep() {
		System.out.printf("나이가 %s인 %s가(이) 잠자고 있다\n", age, job);
	}
}



public class E01PersonMainTest {

	public static void main(String[] args) {
		
		Person2 person = new Person2();
		
		person.eat();
		person.sleep();
	}

}
