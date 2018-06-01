package fr.mrcraftcod.java.tp2.part2.exceptions;

/**
 * Exception when a value is not in range.
 * <p>
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 23/04/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-04-23
 */
public class NotInRangeException extends Exception
{
	private static final long serialVersionUID = -707197718234980859L;
	
	/**
	 * Constructor.
	 *
	 * @param message The exception message.
	 *
	 * @see Exception#Exception(String)
	 */
	public NotInRangeException(String message)
	{
		super(message);
	}
}
