package adapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
/**
 * 适配器  将迭代器转换成枚举
 * @author xuanguojing
 *
 * @param <E>
 */
public class IteratorAdapter<E> implements Enumeration<E> {

	private Iterator<E> iterator;
	
	public IteratorAdapter(Iterator<E> iterator) {
		this.iterator = iterator;
	}
	
	@Override
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}

	@Override
	public E nextElement() {
		return iterator.next();
	}
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("123");
		list.add("456");
		list.add("abc");
		
		IteratorAdapter<String> iteratorAdapter = new IteratorAdapter(list.iterator());
		while(iteratorAdapter.hasMoreElements()) {
			System.out.println(iteratorAdapter.nextElement());
		}
	}
}
