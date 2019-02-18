package strategy;
/**
 * ����ģʽ����
 * @author xuanguojing
 *
 */
public class TestStrategy {
	
	public static void main(String[] args) {
		King king1 = new King("����1");
		king1.setWeapon(new SwordBehavior());
		king1.fight();
		
		Queen queen = new Queen("�ʺ�1");
		queen.setWeapon(new KnifeBehavoir());
		queen.fight();
		
		queen.setWeapon(new BowAndArrowBehavoir());
		queen.fight();
	}
}
