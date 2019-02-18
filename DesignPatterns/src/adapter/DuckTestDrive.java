package adapter;

public class DuckTestDrive {
	
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		System.out.println("The Duck says¡­¡­");
		testDuck(duck);	
		System.out.println();
		
		Turkey turkey = new WildTurkey();
		System.out.println("The turkey says¡­¡­");
		testTurkey(turkey);
		System.out.println();
		
		
		TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
		System.out.println("Turkey Adapter says¡­¡­");
		testDuck(turkeyAdapter);
		System.out.println();
		
		DuckAdapter duckAdapter = new DuckAdapter(duck);
		System.out.println("DuckAdapter says¡­¡­");
		testTurkey(duckAdapter);
		System.out.println();
	}
	
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
	static void testTurkey(Turkey turkey) {
		turkey.gobble();
		turkey.fly();
	}
}
