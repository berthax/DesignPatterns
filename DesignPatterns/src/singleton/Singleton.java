package singleton;
/**
 * ����ģʽʵ��
 * @author xuanguojing
 *
 */
public class Singleton {
	
	private static Singleton uniqueInstance;
	/**
	 * ������������˽�еģ��ⲿ�಻�ܵ��ù�������ʵ����
	 */
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();  //����Ҫʱ����ʵ����ʵ�������أ��ӳ�ʵ������
		}
		return uniqueInstance;
	}
	
}
