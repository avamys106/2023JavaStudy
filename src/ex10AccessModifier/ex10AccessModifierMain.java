package ex10AccessModifier;

import ex10AccessModifier.sub.E01AccessModifier2;

public class ex10AccessModifierMain {

	public static void main(String[] args) {

		System.out.println("E01AccessModifier1 객체 생성 및 접근");
		
		/* 동일한 패키지에 선언된 클래스이므로 import 없이 인스턴스를
		생성할 수 있다. */
		E01AccessModifier1 one = new E01AccessModifier1();
		
		/* pribate으로 선언된 멤버는 동일한 패키지에 선언하더라도 접근
		할 수 없다. 동일한 클래스 내에서만 접근을 허용한다. */
		//System.out.println("one.privateVar="+ one.privateVar);
		System.out.println("one.defaultVar="+ one.defaultVar);
		System.out.println("one.publicVar="+ one.publicVar);
		
		//one.pribateMethod();
		one.defaultMethod();
		one.publicMethod();
		
		/* 동일한 패키지에 선언된 클래스이므로 import 없이 인스턴스
		생성이 가능하다. 또한 default 클래스는 동일 패키지내에서는
		접근할 수 없다. */
		System.out.println("DefaultClass 객체 생성 및 접근");
		new DefaultClass1().myFunc();
		
		/////////////////////////////////////////////////
		
		
		System.out.println("E01AccessModifier2 객체 생성 및 접근");
		
		E01AccessModifier2 two = new E01AccessModifier2();
		
		/* 다른 패키지에 선언된 클래스이므로 인스턴스 생성을 위해 import
		선언을 해야한다. 또한 패키지가 다르면 private, default 멤버는
		접근할 수 없다.*/
		//System.out.println("two.privateVar="+ two.privateVar);
		//System.out.println("two.defaultVar="+ two.defaultVar);
		System.out.println("two.publicVar="+ two.publicVar);
		
		//two.privateMethod();
		//two.defaultMethod();
		two.publicMethod();
		
		/* 다른 패키지에 선언된 디폴트 클래스이므로 인스턴스 생성이
		불가능하다. 또한 import 자체도 불가능하므로 아예 사용할 수 없는
		클래스가 된다. */
		System.out.println("DefaultClass 객체 생성 및 접근");
		//new DefaultClass2().myFunc();
	}

}
