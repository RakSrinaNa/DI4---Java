package fr.mrcraftcod.java.tp4.ex2;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 22/05/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-05-22
 */
public class MyLinkedList<E extends Comparable<E>>
{
	private final LinkedList<E> list;
	
	/**
	 * Constructor. Create an empty list.
	 */
	public MyLinkedList()
	{
		list = new LinkedList<>();
	}
	
	/**
	 * Constructor.
	 *
	 * @param c The element to put inside.
	 */
	public MyLinkedList(Collection<? extends E> c)
	{
		list = new LinkedList<>(c);
	}
	
	/**
	 * Add an element to the head of the list.
	 *
	 * @param element The element to add.
	 */
	public void addHead(E element)
	{
		list.addFirst(element);
	}
	
	/**
	 * Add an element to the tail of the list.
	 *
	 * @param element The element to add.
	 */
	public void addTail(E element)
	{
		list.addLast(element);
	}
	
	/**
	 * Get an element.
	 *
	 * @param index The index to fetch.
	 *
	 * @return The element at the given index.
	 */
	public E get(int index)
	{
		return list.get(index);
	}
	
	/**
	 * Sort the list.
	 *
	 * @return This object sorted.
	 */
	public MyLinkedList<E> sort()
	{
		list.sort(Comparator.naturalOrder());
		return this;
	}
}
