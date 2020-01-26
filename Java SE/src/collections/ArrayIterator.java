package collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator<T> implements Iterator<T>
{

	private int index;
	private T[] array;
	
	ArrayIterator(T[] array)
	{
		this.array = array;
		index = 0;
	}
	
	@Override
	public boolean hasNext() 
	{
		return index < array.length;
	}

	@Override
	public T next() {
		if(!hasNext())
			throw new NoSuchElementException();
		else
			return array[index++];
	}

}
