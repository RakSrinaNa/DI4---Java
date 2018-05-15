package fr.mrcraftcod.java.tp1.part2.showtypes;

/**
 * Represents a reportage.
 * <p>
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 19/04/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-04-19
 */
public interface ReportageShowType extends AllShowType
{
	@Override
	default int getConstraintBeginHour()
	{
		return 0;
	}
	
	@Override
	default int getConstraintEndHour()
	{
		return 23;
	}
	
	/**
	 * Get the theme of the reportage.
	 *
	 * @return The theme.
	 */
	String getTheme();
}
