package fr.mrcraftcod.java.tp4.ex3;

import java.util.LinkedList;

/**
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 22/05/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-05-22
 */
public class PuppetList extends LinkedList<RussianPuppet>
{
	/**
	 * Constructor. Create an empty list.
	 */
	public PuppetList()
	{
		super();
	}
	
	@Override
	public boolean add(RussianPuppet puppet)
	{
		if(isEmpty())
			addLast(puppet);
		else
		{
			if(puppet.canContain(getLast()))
				addLast(puppet);
			else
				return false;
		}
		return true;
	}
}
