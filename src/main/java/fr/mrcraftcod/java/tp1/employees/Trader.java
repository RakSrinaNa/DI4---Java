package fr.mrcraftcod.java.tp1.employees;

import fr.mrcraftcod.java.tp1.pay.WagedTurnover;

/**
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 19/04/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-04-19
 */
public class Trader extends Employee implements WagedTurnover
{
	private static final double TURNOVER_PERCENTAGE = 0.09;
	private double turnover = 0;
	
	public Trader(String firstName, String lastName)
	{
		super(firstName, lastName);
	}
	
	public Trader(String firstName, String lastName, double turnover)
	{
		super(firstName, lastName);
		this.turnover = turnover;
	}
	
	public void setTurnover(double turnover)
	{
		this.turnover = turnover;
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
}
