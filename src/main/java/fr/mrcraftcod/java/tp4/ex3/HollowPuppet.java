package fr.mrcraftcod.java.tp4.ex3;

/**
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 22/05/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-05-22
 */
public class HollowPuppet extends RussianPuppet
{
	/**
	 * Constructor.
	 *
	 * @param size The puppet's size.
	 */
	public HollowPuppet(int size)
	{
		super(size);
	}
	
	@Override
	public boolean canContain(RussianPuppet puppet)
	{
		return puppet.getSize() < getSize();
	}
}
