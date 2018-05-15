package fr.mrcraftcod.java.tp1.part2.showtypes;

/**
 * Represent an entertainment show, forced to be 2h long and between 18h and 23h.
 * <p>
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 19/04/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-04-19
 */
public interface EntertainmentShowType extends AllShowType
{
	@Override
	default int getConstraintBeginHour()
	{
		return 18;
	}
	
	@Override
	default int getConstraintEndHour()
	{
		return 23;
	}
	
	@Override
	default int getLength()
	{
		return 2;
	}
}
