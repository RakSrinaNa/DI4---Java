package fr.mrcraftcod.java.tp1.part2.showtypes;

/**
 * Represents a show.
 * <p>
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 19/04/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-04-19
 */
public interface AllShowType
{
	/**
	 * Get the minimum hour the show can begin.
	 *
	 * @return The minimum hour.
	 */
	int getConstraintBeginHour();
	
	/**
	 * Get the maximum hour the show can begin.
	 *
	 * @return The maximum hour.
	 */
	int getConstraintEndHour();
	
	/**
	 * Get the length of the show.
	 *
	 * @return The length in hours.
	 */
	int getLength();
	
	/**
	 * Get the name of the show.
	 *
	 * @return The name of the show.
	 */
	String getName();
}
