package singleton;
/**
 * 巧克力锅炉单例……双重检查加锁
 * @author xuanguojing
 *
 */
public class ChocolateBoiler {
	//volatile多线程可见性，保证多个线程正确的处理chocolateBoiler	
	private static volatile ChocolateBoiler chocolateBoiler;
	
	private ChocolateBoiler() {}
	
	public static ChocolateBoiler getInstance() {
		if(chocolateBoiler == null) {
			synchronized (ChocolateBoiler.class) {
				if(chocolateBoiler == null)
					chocolateBoiler = new ChocolateBoiler();
			}
		}
		return chocolateBoiler;
	}
}
