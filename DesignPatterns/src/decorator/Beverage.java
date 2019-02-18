package decorator;

/**
 * 饮料抽象类
 * @author xuanguojing
 *
 */
public abstract class Beverage {
	
	String description = "Unknown Beverage";
	
	public static final int TALL = 1;    //小杯
	public static final int GRANDE = 2;  //中杯
	public static final int VENTI = 3;   //大杯
	
	public int size = TALL;              //默认是小杯

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getDescription() {
		return description;
	}

	//该方法必须在子类中实现
	public abstract double cost();
}
