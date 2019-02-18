package decorator;

public class Soy extends CondimentDecorator {
	//被装饰者的引用
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy" + (beverage.getSize()==Beverage.TALL?"小杯":beverage.getSize()==Beverage.GRANDE?"中杯":"大杯");
	}
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return beverage.getSize();
	}
	
	@Override
	public double cost() 
	{
		double cost = beverage.cost();
		if(getSize() == Beverage.TALL) {
			cost += 0.10;
		}else if(getSize() == Beverage.GRANDE) {
			cost += 0.15;
		}else if(getSize() == Beverage.VENTI) {
			cost += 0.20;
		}
		return cost;
	}
}
