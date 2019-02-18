package decorator;
/**
 * ����
 * @author xuanguojing
 *
 */
public class Whip extends CondimentDecorator {

	//��װ���ߵ�����
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		super();
		this.beverage = beverage;
	}
		
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return 0.1 + beverage.cost();
	}

	@Override
	public int getSize() {
		return beverage.getSize();
	}

}
