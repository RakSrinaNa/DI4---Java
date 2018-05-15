package fr.mrcraftcod.java.tp2.part1.exceptions;

/**
 * Represent an exception when a value is negative.
 * <p>
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 23/04/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-04-23
 */
public class NegativeNumberException extends Exception
{
	/**
	 * Constructor.
	 *
	 * @param message The exception message.
	 *
	 * @see Exception#Exception(String)
	 */
	public NegativeNumberException(String message)
	{
		super(message);
	}
}
