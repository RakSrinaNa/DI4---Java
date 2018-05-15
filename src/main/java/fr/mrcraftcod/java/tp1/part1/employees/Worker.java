package fr.mrcraftcod.java.tp1.part1.employees;

import fr.mrcraftcod.java.tp1.part1.pay.WagedOverTime;

/**
 * Represents a basic worker paid by its time worked.
 * <p>
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 19/04/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-04-19
 */
public class Worker extends Employee implements WagedOverTime
{
	private static final double SALARY_HOUR = 12;
	private static final double OVERTIME_BONUS = 1.3;
	private int workedHours = 0;
	
	/**
	 * Constructor.
	 *
	 * @param firstName The first name of the worker.
	 * @param lastName  The last name of the worker.
	 *
	 * @see Employee#Employee(String, String)
	 */
	public Worker(String firstName, String lastName)
	{
		super(firstName, lastName);
	}
	
	/**
	 * Constructor.
	 *
	 * @param firstName   The first name of the worker.
	 * @param lastName    The last name of the worker.
	 * @param workedHours The number of hours worked.
	 *
	 * @see Employee#Employee(String, String)
	 */
	public Worker(String firstName, String lastName, int workedHours)
	{
		super(firstName, lastName);
		this.workedHours = workedHours;
	}
	
	@Override
	public double getPriceHour()
	{
		return SALARY_HOUR;
	}
	
	@Override
	public int getWorkedHours()
	{
		return workedHours;
	}
	
	/**
	 * Set the number of hours worked.
	 *
	 * @param workedHours The amount of hours worked.
	 */
	public void setWorkedHours(int workedHours)
	{
		this.workedHours = workedHours;
	}
	
	@Override
	public double getBonusOvertime()
	{
		return OVERTIME_BONUS;
	}
}
