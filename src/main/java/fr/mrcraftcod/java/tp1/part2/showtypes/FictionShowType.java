package fr.mrcraftcod.java.tp1.part2.showtypes;

/**
 * Represents a fiction show, forced to be at 21h if not a rebroadcasting.
 * <p>
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 19/04/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-04-19
 */
public interface FictionShowType extends AllShowType
{
	@Override
	default int getConstraintBeginHour()
	{
		return isRebroadcast() ? 0 : 21;
	}
	
	/**
	 * Tell if this show is a rebroadcast.
	 *
	 * @return True if rebroadcasting, false otherwise.
	 */
	boolean isRebroadcast();
	
	@Override
	default int getConstraintEndHour()
	{
		return isRebroadcast() ? 23 : 21;
	}
	
	/**
	 * Get the name of the director.
	 *
	 * @return The director's name.
	 */
	String getDirectorName();
	
	/**
	 * Get the year of this fiction.
	 *
	 * @return The year.
	 */
	int getYear();
}
