package decorator;

/**
 * Ũ������������
 * @author xuanguojing
 *
 */
public class Espresso extends Beverage{

	public Espresso() {
		// TODO Auto-generated constructor stub
		description = "Espresso";
	}
	
	@Override
	public double cost() {		
		return 1.99;
	}

}
