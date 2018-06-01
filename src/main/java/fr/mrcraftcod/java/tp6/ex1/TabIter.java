package fr.mrcraftcod.java.tp6.ex1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 01/06/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-06-01
 */
public class TabIter<E> implements Iterator<E>
{
	private E[] array;
	private int index;
	
	public TabIter()
	{
		index = -1;
	}
	
	@Override
	public boolean hasNext()
	{
		return index < array.length - 1 && array[index + 1] != null;
	}
	
	@Override
	public E next()
	{
		if(!hasNext())
			throw new NoSuchElementException();
		return array[index++];
	}
	
	@Override
	public void remove()
	{
		throw new UnsupportedOperationException();
	}
}
