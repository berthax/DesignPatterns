package strategy;
/**
 * 策略模式例子
 * @author xuanguojing
 *
 */
public class TestStrategy {
	
	public static void main(String[] args) {
		King king1 = new King("国王1");
		king1.setWeapon(new SwordBehavior());
		king1.fight();
		
		Queen queen = new Queen("皇后1");
		queen.setWeapon(new KnifeBehavoir());
		queen.fight();
		
		queen.setWeapon(new BowAndArrowBehavoir());
		queen.fight();
	}
}
