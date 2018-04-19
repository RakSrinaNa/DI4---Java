package fr.mrcraftcod.java.tp1.employees;

import fr.mrcraftcod.java.tp1.pay.WagedTurnover;

/**
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
	
	public Collaborator(String firstName, String lastName)
	{
		super(firstName, lastName);
	}
	
	public Collaborator(String firstName, String lastName, int workedHours, double turnover)
	{
		super(firstName, lastName, workedHours);
		this.turnover = turnover;
	}
	
	public void setTurnover(double turnover)
	{
		this.turnover = turnover;
	}
	
	@Override
	public double getWage()
	{
		return super.getWage() + WagedTurnover.super.getWage();
	}
	
	@Override
	public double getTurnover()
	{
		return turnover;
	}
	
	@Override
	public double getTurnoverPercentage()
	{
		return TURNOVER_PERCENTAGE;
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
}
