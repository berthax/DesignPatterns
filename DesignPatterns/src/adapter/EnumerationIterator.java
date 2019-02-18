package adapter;

import java.util.Enumeration;
import java.util.Iterator;
/**
 * ÊÊÅäÆ÷  Ã¶¾Ù×ª»»³Éµü´úÆ÷
 * @author xuanguojing
 *
 * @param <E>
 */
public class EnumerationIterator<E> implements Iterator<E> {

	Enumeration<E> enumeration;
	
	public EnumerationIterator(Enumeration<E> enumeration) {
		// TODO Auto-generated constructor stub
		this.enumeration = enumeration;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return enumeration.hasMoreElements();
	}

	@Override
	public E next() {
		// TODO Auto-generated method stub
		return enumeration.nextElement();
	}
}
