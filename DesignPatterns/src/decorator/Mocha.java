package decorator;
/**
 * Ä¦¿¨µ÷ÁÏ×°ÊÎÆ÷
 * @author xuanguojing
 *
 */
public class Mocha extends CondimentDecorator {
	Beverage beverage;
	
	
	public Mocha(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.20 + beverage.cost();
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return beverage.getSize();
	}

}
