package decorator;

/**
 * ���ϳ�����
 * @author xuanguojing
 *
 */
public abstract class Beverage {
	
	String description = "Unknown Beverage";
	
	public static final int TALL = 1;    //С��
	public static final int GRANDE = 2;  //�б�
	public static final int VENTI = 3;   //��
	
	public int size = TALL;              //Ĭ����С��

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getDescription() {
		return description;
	}

	//�÷���������������ʵ��
	public abstract double cost();
}
