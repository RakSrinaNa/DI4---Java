package fr.mrcraftcod.java.utils;

/**
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 22/05/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-05-22
 */
public class MenuAction
{
	private final String name;
	private final Runnable callback;
	
	/**
	 * Constructor.
	 *
	 * @param name     The name of the action.
	 * @param callback The action to perform when this action is selected.
	 */
	public MenuAction(String name, Runnable callback)
	{
		this.name = name;
		this.callback = callback;
	}
	
	/**
	 * Get the action to perform.
	 *
	 * @return The action to perform.
	 */
	public Runnable getCallback()
	{
		return callback;
	}
	
	/**
	 * Get the name of the action.
	 *
	 * @return The action's name.
	 */
	public String getName()
	{
		return name;
	}
}
