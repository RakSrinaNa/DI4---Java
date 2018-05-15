package fr.mrcraftcod.java.tp1.part1.employees;

import fr.mrcraftcod.java.tp1.part1.pay.WagedTurnover;

/**
 * Represent a trader, paid by a percentage of the turnover this person makes.
 * <p>
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 19/04/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-04-19
 */
public class Trader extends Employee implements WagedTurnover
{
	private static final double TURNOVER_PERCENTAGE = 0.09;
	private double turnover = 0;
	
	/**
	 * Constructor.
	 *
	 * @param firstName The first name of the executive.
	 * @param lastName  The last name of the executive.
	 *
	 * @see Employee#Employee(String, String)
	 */
	public Trader(String firstName, String lastName)
	{
		super(firstName, lastName);
	}
	
	/**
	 * Constructor.
	 *
	 * @param firstName The first name of the executive.
	 * @param lastName  The last name of the executive.
	 * @param turnover  The turnover made by this person.
	 *
	 * @see Employee#Employee(String, String)
	 */
	public Trader(String firstName, String lastName, double turnover)
	{
		super(firstName, lastName);
		this.turnover = turnover;
	}
	
	@Override
	public double getTurnoverPercentage()
	{
		return TURNOVER_PERCENTAGE;
	}
	
	@Override
	public double getTurnover()
	{
		return turnover;
	}
	
	/**
	 * Set the turnover made by this person.
	 *
	 * @param turnover The turnover.
	 */
	public void setTurnover(double turnover)
	{
		this.turnover = turnover;
	}
}
