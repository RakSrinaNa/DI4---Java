package fr.mrcraftcod.java.tp1.employees;

/**
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 19/04/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-04-19
 */
public class Executive extends Worker
{
	private static final int SALARY_HOUR = 15;
	private static final double OVERTIME_BONUS = 1.5;
	
	public Executive(String firstName, String lastName)
	{
		super(firstName, lastName);
	}
	
	public Executive(String firstName, String lastName, int workedHours)
	{
		super(firstName, lastName, workedHours);
	}
	
	@Override
	public double getPriceHour()
	{
		return SALARY_HOUR;
	}
	
	@Override
	public double getBonusOvertime()
	{
		return OVERTIME_BONUS;
	}
}
