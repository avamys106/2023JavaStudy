package terran;

class Barracks{
	
}


class Unit{
	int cost;
	int hp;
	int def;
	int atk;
	int pop;
	public Unit(int cost, int hp, int def, int atk, int pop) {
		this.cost = cost;
		this.hp = hp;
		this.def = def;
		this.atk = atk;
		this.pop = pop;
	}
	public void showUnitInfo() {
		System.out.print("비용:" + cost + "m ");
		System.out.println("인구수:" + pop);
		System.out.println("체력:" + hp + " ");
		System.out.print("공격력:" + atk + " ");
		System.out.print("방어력:" + def + " ");
	}
}
class Marin extends Unit{
	String name;
	public Marin(String name, int cost , int hp, int def, int atk, int pop) {
		super(50, 40, 0, 6, 1);
		this.name = "마린";
	}
	@Override
	public void showUnitInfo() {
		System.out.println("유닛:" + name + " 비용:" + cost + " 인구수:" + pop);
		System.out.println("체력:" + hp);
		System.out.println("공격력:" + atk + " 방어력:" + def);
	}

}



public class Test {
	
	public static void showInfo() {
		System.out.println("-----목록선택-----");
		System.out.print("1.플레이어 정보");
		System.out.println("2.ㅁㄴㅇ");
		System.out.print("3.유닛보기 ");
		System.out.println("4.간략정보출력");
		System.out.print("5.검색");
		System.out.print("6.삭제");
		System.out.println("7.프로그램종료");
		System.out.println("메뉴선택>>>");
	}

	public static void main(String[] args) {

		Marin marin = new Marin("s",0, 0, 0, 0, 0);
		marin.showUnitInfo();
		showInfo();
	}

	
}
