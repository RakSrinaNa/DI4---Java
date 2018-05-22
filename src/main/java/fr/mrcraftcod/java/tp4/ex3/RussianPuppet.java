package fr.mrcraftcod.java.tp4.ex3;

/**
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 22/05/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-05-22
 */
public abstract class RussianPuppet
{
	private final int size;
	
	/**
	 * Constructor.
	 *
	 * @param size The size of the puppet.
	 */
	public RussianPuppet(int size)
	{
		if(size <= 0)
			throw new IllegalArgumentException("Size cannot be negative or zero");
		this.size = size;
	}
	
	/**
	 * Tell if this puppet can install another one.
	 *
	 * @param puppet The puppet to try to fit inside.
	 *
	 * @return True if can be put inside, false otherwise.
	 */
	public abstract boolean canContain(RussianPuppet puppet);
	
	/**
	 * Get the size of the puppet.
	 *
	 * @return The size.
	 */
	public int getSize()
	{
		return size;
	}
}
