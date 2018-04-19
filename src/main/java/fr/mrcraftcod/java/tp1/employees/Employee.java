package fr.mrcraftcod.java.tp1.employees;

import fr.mrcraftcod.java.tp1.pay.Waged;

/**
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 19/04/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-04-19
 */
public abstract class Employee implements Waged
{
	private final String firstName;
	private final String lastName;
	
	public Employee(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public String toString()
	{
		return getFirstName() + " " + getLastName();
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
}
