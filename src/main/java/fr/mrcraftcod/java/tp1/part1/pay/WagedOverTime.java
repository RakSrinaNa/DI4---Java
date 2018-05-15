package fr.mrcraftcod.java.tp1.part1.pay;

/**
 * Represent a person that is paid depending on how many hours he worked, and how many hours were over time.
 * <p>
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 19/04/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-04-19
 */
public interface WagedOverTime extends Waged
{
	int WEEK_HOURS = 35;
	
	@Override
	default double getWage()
	{
		return getPriceHour() * (Math.max(0, getWorkedHours() - WEEK_HOURS) * getBonusOvertime() + Math.min(getWorkedHours(), WEEK_HOURS));
	}
	
	/**
	 * Get the multiplier to apply for the hours being over time.
	 *
	 * @return The overtime multiplier. If this value is 1, no bonus will be applied. A value of 1.5 will give a bonus of 50%.
	 */
	double getBonusOvertime();
	
	/**
	 * Get the amount paid per hour worked.
	 *
	 * @return The base amount.
	 */
	double getPriceHour();
	
	/**
	 * Get the number of worked hours.
	 *
	 * @return The hours worked.
	 */
	int getWorkedHours();
}
