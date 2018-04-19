package fr.mrcraftcod.java.tp1.employees;

import fr.mrcraftcod.java.tp1.pay.WagedOverTime;

/**
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
	
	public Worker(String firstName, String lastName)
	{
		super(firstName, lastName);
	}
	
	public Worker(String firstName, String lastName, int workedHours)
	{
		super(firstName, lastName);
		this.workedHours = workedHours;
	}
	
	public void setWorkedHours(int workedHours)
	{
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
	
	@Override
	public double getBonusOvertime()
	{
		return OVERTIME_BONUS;
	}
}
