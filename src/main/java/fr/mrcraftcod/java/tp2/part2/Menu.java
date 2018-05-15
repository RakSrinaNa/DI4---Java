package fr.mrcraftcod.java.tp2.part2;

import fr.mrcraftcod.java.tp2.part2.exceptions.NotAnIntegerException;
import fr.mrcraftcod.java.tp2.part2.exceptions.NotInRangeException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * The menu exercise.
 * <p>
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 23/04/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-04-23
 */
public class Menu
{
	/**
	 * @param args Not used.
	 */
	public static void main(String[] args)
	{
		String[] choices = {
				"Frites",
				"Steak",
				"Pates",
				"Nouilles",
				"Moules",
				"Saucisses",
				"Merguez",
				"Lardon",
				"Pain au chocolat",
				"Chocolatine",
				"Riz",
				"Semoule",
				"Hamburger",
				"Pain"
		};
		if(choices.length > 0)
			System.out.println("Choice selected: " + choices[askChoice(choices) - 1]);
		else
			System.out.println("Menu is empty");
	}
	
	/**
	 * Ask the input of the user until the choice is valid.
	 *
	 * @param choices The choices available.
	 *
	 * @return The choice selected.
	 */
	private static int askChoice(String[] choices)
	{
		showChoices(choices);
		while(true)
		{
			try
			{
				return selectChoice(choices.length);
			}
			catch(NotInRangeException | NotAnIntegerException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	
	/**
	 * Shows the menu.
	 *
	 * @param choices The choices available.
	 */
	private static void showChoices(String[] choices)
	{
		int i = 1;
		for(String choice : choices)
			System.out.println(i++ + ": " + choice);
	}
	
	/**
	 * Ask the user for a choice.
	 *
	 * @param max The max value that can be chosen.
	 *
	 * @return The chosen value.
	 *
	 * @throws NotAnIntegerException When the value given is not an integer
	 * @throws NotInRangeException   If the choice given is not in the selectable range.
	 */
	private static int selectChoice(int max) throws NotAnIntegerException, NotInRangeException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Choice (max " + max + ") ? ");
		String choice = sc.nextLine().trim();
		if(choice.equals(""))
			throw new NotAnIntegerException("Please enter a value");
		if(!Pattern.compile("\\d+").matcher(choice).matches())
			throw new NotAnIntegerException("Please give an integer");
		int choiceInteger = Integer.parseInt(choice);
		if(choiceInteger < 1 || choiceInteger > max)
			throw new NotInRangeException("Please enter an integer between 1 and " + max);
		return choiceInteger;
	}
}
