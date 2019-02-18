package singleton;
/**
 * �ɿ�����¯��������˫�ؼ�����
 * @author xuanguojing
 *
 */
public class ChocolateBoiler {
	//volatile���߳̿ɼ��ԣ���֤����߳���ȷ�Ĵ���chocolateBoiler	
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
