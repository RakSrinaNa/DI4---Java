package fr.mrcraftcod.java.tp2.part1;

import fr.mrcraftcod.java.tp2.part1.exceptions.NegativeNumberException;
import fr.mrcraftcod.java.tp2.part1.exceptions.TooBigException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * The factorial exercise.
 * <p>
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 23/04/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-04-23
 */
public class Factorial
{
	/**
	 * @param args Not used.
	 */
	public static void main(String[] args)
	{
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.print("Factorial of? ");
			String line = sc.nextLine().trim();
			if(line.equals(""))
				throw new ArrayIndexOutOfBoundsException("Please enter a value");
			if(!Pattern.compile("-?\\d+").matcher(line).matches())
				throw new NumberFormatException("Please give an integer");
			int fact = Integer.parseInt(line);
			if(fact < 0)
				throw new NegativeNumberException("Please enter a positive integer");
			if(fact > 13)
				throw new TooBigException("Please enter a lower value else you'll make your computer explode");
			
			System.out.println("Factorial of " + fact + " is: " + factorial(fact));
		}
		catch(ArrayIndexOutOfBoundsException | NumberFormatException | NegativeNumberException | TooBigException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * Calculate the factorial of a value.
	 *
	 * @param fact The factorial to get.
	 *
	 * @return The value of this factorial.
	 */
	private static int factorial(int fact)
	{
		if(fact <= 1)
			return 1;
		return fact * factorial(fact - 1);
	}
}
