package fr.mrcraftcod.java.tp1.part1.employees;

import fr.mrcraftcod.java.tp1.part1.pay.WagedTurnover;

/**
 * Represent a collaborator, paid by its worked time and turnover.
 * <p>
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 19/04/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-04-19
 */
public class Collaborator extends Executive implements WagedTurnover
{
	private static final double TURNOVER_PERCENTAGE = 0.09;
	private static final double PRICE_HOUR = 14;
	private static final double OVERTIME_BONUS = 1.4;
	private double turnover = 0;
	
	/**
	 * Constructor.
	 *
	 * @param firstName The first name of the executive.
	 * @param lastName  The last name of the executive.
	 *
	 * @see Executive#Executive(String, String) (String, String)
	 */
	public Collaborator(String firstName, String lastName)
	{
		super(firstName, lastName);
	}
	
	/**
	 * Constructor.
	 *
	 * @param firstName   The first name of the executive.
	 * @param lastName    The last name of the executive.
	 * @param workedHours The number of hours worked.
	 * @param turnover    The turnover made by this person.
	 *
	 * @see Executive#Executive(String, String, int)
	 */
	public Collaborator(String firstName, String lastName, int workedHours, double turnover)
	{
		super(firstName, lastName, workedHours);
		this.turnover = turnover;
	}
	
	@Override
	public double getPriceHour()
	{
		return PRICE_HOUR;
	}
	
	@Override
	public double getBonusOvertime()
	{
		return OVERTIME_BONUS;
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
	
	@Override
	public double getWage()
	{
		return super.getWage() + WagedTurnover.super.getWage();
	}
}
