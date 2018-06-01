package fr.mrcraftcod.java.tp6.ex2;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 01/06/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-06-01
 */
public class TabSet<E> implements Set<E>
{
	private E[] array;
	private int count;
	
	/**
	 * Iterator for this set.
	 */
	private class TabIter implements Iterator<E>
	{
		private int index;
		
		/**
		 * Constructor.
		 */
		TabIter()
		{
			index = -1;
		}
		
		@Override
		public boolean hasNext()
		{
			return IntStream.range(index + 1, array.length).anyMatch(i -> Objects.nonNull(array[i]));
		}
		
		@Override
		public E next()
		{
			if(!hasNext())
				throw new NoSuchElementException();
			E item;
			do
			{
				item = array[++index];
			}
			while(Objects.isNull(item)); //We can keep going as we know where's an element somewhere
			return item;
		}
		
		@Override
		public void remove()
		{
			array[index] = null;
			TabSet.this.count--;
		}
	}
	
	/**
	 * Constructor.
	 */
	TabSet()
	{
		this.count = 0;
		//noinspection unchecked
		this.array = (E[]) new Object[10];
	}
	
	@Override
	public int size()
	{
		return count;
	}
	
	@Override
	public boolean isEmpty()
	{
		return count < 1;
	}
	
	@Override
	public boolean contains(Object o)
	{
		//noinspection SimplifyStreamApiCallChains
		return Arrays.stream(array).anyMatch(oo -> Objects.equals(o, oo));
	}
	
	@Override
	public Iterator<E> iterator()
	{
		return new TabIter();
	}
	
	@Override
	public Object[] toArray()
	{
		return Arrays.stream(array).filter(Objects::nonNull).toArray();
	}
	
	@Override
	public <T> T[] toArray(T[] a)
	{
		if(a.length <= array.length) //If a is big enough
		{
			int j = 0;
			for(int i = 0; i < array.length; i++) //For each
			{
				if(Objects.nonNull(array[i])) //Put non null
				{
					//noinspection unchecked
					a[i] = (T) array[i];
					j++;
				}
			}
			for(; j < a.length; j++) //Fill what's left with null
				a[j] = null;
			return a;
		}
		//noinspection unchecked
		return (T[]) Arrays.stream(array).filter(Objects::nonNull).map(o -> (T) o).toArray();
	}
	
	@Override
	public boolean add(E e)
	{
		if(contains(e))
			return false;
		
		if(count++ > array.length) //If array not big enough, make it larger
		{
			array = Arrays.copyOf(array, array.length * 2);
			for(int i = count; i < array.length; i++)
				array[i] = null;
		}
		for(int i = 0; i < array.length; i++) //Add in first null spot
			if(Objects.isNull(array[i]))
			{
				array[i] = e;
				break;
			}
		return true;
	}
	
	@Override
	public boolean remove(Object o)
	{
		boolean changed = false;
		Iterator<E> iter = iterator();
		while(iter.hasNext())
			if(Objects.equals(iter.next(), o))
			{
				iter.remove();
				changed = true;
			}
		return changed;
	}
	
	@Override
	public boolean containsAll(Collection<?> c)
	{
		return c.stream().allMatch(this::contains);
	}
	
	@Override
	public boolean addAll(Collection<? extends E> c)
	{
		return c.stream().map(this::add).mapToInt(e -> e ? 1 : 0).sum() > 0;
	}
	
	@Override
	public boolean retainAll(Collection<?> c)
	{
		boolean changed = false;
		Iterator<E> iter = iterator();
		while(iter.hasNext())
			if(!c.contains(iter.next()))
			{
				iter.remove();
				changed = true;
			}
		return changed;
	}
	
	@Override
	public boolean removeAll(Collection<?> c)
	{
		return c.stream().map(this::remove).mapToInt(e -> e ? 1 : 0).sum() > 0;
	}
	
	@Override
	public void clear()
	{
		for(int i = 0; i < array.length; i++)
			array[i] = null;
		count = 0;
	}
	
	/**
	 * Get the size of the internal array.
	 *
	 * @return The size of the array.
	 */
	int realSize()
	{
		return array.length;
	}
	
	/**
	 * Get the internal array.
	 *
	 * @return The array.
	 */
	E[] realArray()
	{
		return array;
	}
}
