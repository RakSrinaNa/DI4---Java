package fr.mrcraftcod.java.tp2.part1.exceptions;

/**
 * Represent an exception when a value is too big.
 * <p>
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 23/04/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-04-23
 */
public class TooBigException extends Exception
{
	private static final long serialVersionUID = -4251956308281908195L;
	
	/**
	 * Constructor.
	 *
	 * @param message The exception message.
	 *
	 * @see Exception#Exception(String)
	 */
	public TooBigException(String message)
	{
		super(message);
	}
}
