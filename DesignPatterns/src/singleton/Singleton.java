package singleton;
/**
 * 单例模式实例
 * @author xuanguojing
 *
 */
public class Singleton {
	
	private static Singleton uniqueInstance;
	/**
	 * 构造器必须是私有的，外部类不能调用构造器来实例化
	 */
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();  //当需要时创建实例，实现懒加载（延迟实例化）
		}
		return uniqueInstance;
	}
	
}
