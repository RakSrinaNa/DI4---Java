package fr.mrcraftcod.java.tp2.part2.exceptions;

/**
 * Represent an exception the value is not an integer.
 * <p>
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 23/04/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-04-23
 */
public class NotAnIntegerException extends Exception
{
	private static final long serialVersionUID = 8693488008398662790L;
	
	/**
	 * Constructor.
	 *
	 * @param message The exception message.
	 *
	 * @see Exception#Exception(String)
	 */
	public NotAnIntegerException(String message)
	{
		super(message);
	}
}
