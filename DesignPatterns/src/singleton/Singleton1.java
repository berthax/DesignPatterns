package singleton;

public class Singleton1 {
	
	private static Singleton1 uniqueInstance = new Singleton1();  //急切实例化，未使用懒加载，在类加载的时候即完成实例化
	/**
	 * 构造器必须是私有的，外部类不能调用构造器来实例化
	 */
	private Singleton1() {}
	
	public static Singleton1 getInstance() {
		return uniqueInstance;
	}
}
