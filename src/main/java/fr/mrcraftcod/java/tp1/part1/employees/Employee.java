package fr.mrcraftcod.java.tp1.part1.employees;

import fr.mrcraftcod.java.tp1.part1.pay.Waged;

/**
 * Represents an employee.
 * <p>
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 19/04/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-04-19
 */
public abstract class Employee implements Waged
{
	private final String firstName;
	private final String lastName;
	
	/**
	 * Constructor.
	 *
	 * @param firstName The first name of the employee.
	 * @param lastName  The last name of the employee.
	 */
	protected Employee(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public String toString()
	{
		return getFirstName() + " " + getLastName();
	}
	
	/**
	 * Get the first name of the employee.
	 *
	 * @return The employee's first name.
	 */
	public String getFirstName()
	{
		return firstName;
	}
	
	/**
	 * Get the last name of the employee.
	 *
	 * @return The employee's last name.
	 */
	public String getLastName()
	{
		return lastName;
	}
}
