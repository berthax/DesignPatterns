package adapter;
/**
 * ������ģʽ����һ����Ľӿڣ�ת���ɿͻ���������һ���ӿڡ���������ԭ���ӿڲ����ݵ�����Ժ����޼�
 * 
 *����Ϊ����������
 * 
 * ��������---������αװΪѼ��
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
