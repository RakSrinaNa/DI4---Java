package fr.mrcraftcod.java.tp1.pay;

/**
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
	
	double getPriceHour();
	
	int getWorkedHours();
	
	double getBonusOvertime();
}
