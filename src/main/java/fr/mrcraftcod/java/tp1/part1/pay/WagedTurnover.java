package fr.mrcraftcod.java.tp1.part1.pay;

/**
 * Represent someone that is paid depending on the turnover that this person made.
 * <p>
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 19/04/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-04-19
 */
public interface WagedTurnover extends Waged
{
	@Override
	default double getWage()
	{
		return getTurnoverPercentage() * getTurnover();
	}
	
	/**
	 * Get the turnover done by this person.
	 *
	 * @return The turnover.
	 */
	double getTurnover();
	
	/**
	 * Get how much of the turnover this person make.
	 *
	 * @return The turnover percentage given as a wage. Value is between 0 and 1.
	 */
	double getTurnoverPercentage();
}
