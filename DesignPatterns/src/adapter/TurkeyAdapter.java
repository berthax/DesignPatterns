package adapter;
/**
 * 适配器模式，将一个类的接口，转换成客户期望的另一个接口。适配器让原本接口不兼容的类可以合作无间
 * 
 *以下为对象适配器
 * 
 * 火鸡适配器---》将火鸡伪装为鸭子
 * @author xuanguojing
 *
 */
public class TurkeyAdapter implements Duck{
	private Turkey turkey;
		
	public TurkeyAdapter(Turkey turkey) {
		super();
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		this.turkey.gobble();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
			this.turkey.fly();
	}

}
