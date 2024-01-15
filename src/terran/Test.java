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
		super(cost, hp, def, atk, pop);
		this.name = name;
	}
	@Override
	public void showUnitInfo() {
		System.out.println("유닛:" + name + " 비용:" + cost + " 인구수:" + pop);
		System.out.println("체력:" + hp);
		System.out.println("공격력:" + atk + " 방어력:" + def);
	}
}



public class Test {

	public static void main(String[] args) {

		Marin marin = new Marin("마린",50, 40, 0, 6, 1);
		marin.showUnitInfo();
	}

}
