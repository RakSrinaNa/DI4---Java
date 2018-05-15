package fr.mrcraftcod.java.tp1.part2.shows;

import fr.mrcraftcod.java.tp1.part2.showtypes.AllShowType;

/**
 * Represents a show.
 * <p>
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 19/04/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-04-19
 */
public abstract class Show implements AllShowType
{
	private final String name;
	private int length;
	
	/**
	 * Constructor.
	 *
	 * @param name   The name of the show.
	 * @param length The length of the show in hours.
	 */
	public Show(String name, int length)
	{
		this.name = name;
		this.length = length;
	}
	
	@Override
	public String toString()
	{
		return getName() + " (" + getLength() + "h)";
	}
	
	@Override
	public int getLength()
	{
		return length;
	}
	
	@Override
	public String getName()
	{
		return name;
	}
	
	/**
	 * Set the length of the show.
	 *
	 * @param length The length in hours.
	 */
	public void setLength(int length)
	{
		this.length = length;
	}
	
	/**
	 * Tell if the show can be planned at the given hour.
	 *
	 * @param hour The beginning hour of the schedule.
	 *
	 * @return True if can be scheduled, false otherwise.
	 */
	public boolean canBePlannedAt(int hour)
	{
		return hour >= getConstraintBeginHour() && hour + getLength() - 1 <= getConstraintEndHour();
	}
}
