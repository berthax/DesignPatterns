package decorator;
/**
 * 奶泡
 * @author xuanguojing
 *
 */
public class Whip extends CondimentDecorator {

	//被装饰者的引用
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
