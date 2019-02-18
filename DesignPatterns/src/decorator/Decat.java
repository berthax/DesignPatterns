package decorator;
/**
 * µÕøß∑»“Ú
 * @author xuanguojing
 *
 */
public class Decat extends Beverage {

	public Decat() {
		description = "Decat Coffee";
	}

	@Override
	public double cost() {
		return 1.05;
	}

}
