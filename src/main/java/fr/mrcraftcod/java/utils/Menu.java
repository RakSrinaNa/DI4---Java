package fr.mrcraftcod.java.utils;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 22/05/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-05-22
 */
public class Menu
{
	private static final MenuAction exitAction = new MenuAction("Exit", () -> System.out.println("Goodbye my lover"));
	private final HashMap<String, MenuAction> actions = new HashMap<>();
	
	/**
	 * Constructor.
	 */
	public Menu()
	{
		actions.put("0", exitAction);
	}
	
	/**
	 * Add an action to the list.
	 *
	 * @param name     The name of the action.
	 * @param callback The action to perform when this action is selected.
	 */
	public void addAction(String name, Runnable callback)
	{
		addAction(new MenuAction(name, callback));
	}
	
	/**
	 * Add an action to the list.
	 *
	 * @param action The action to add.
	 */
	public void addAction(MenuAction action)
	{
		actions.put("" + (actions.keySet().stream().mapToInt(Integer::parseInt).max().orElse(0) + 1), action);
	}
	
	/**
	 * Run the menu until exited.
	 */
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		do
		{
			System.out.println("Actions:\n" + actions.keySet().stream().sorted(Comparator.comparingInt(Integer::parseInt)).map(i -> "\t" + i + " - " + actions.get(i).getName()).collect(Collectors.joining("\n")));
			MenuAction action = actions.get(askLine(sc, "Selection: "));
			if(action == null)
				System.out.println("Invalid selection");
			else if(action == exitAction)
			{
				exitAction.getCallback().run();
				exit = true;
			}
			else
				try
				{
					action.getCallback().run();
				}
				catch(IndexOutOfBoundsException e)
				{
					System.out.println("Given index is not valid");
					e.printStackTrace();
				}
				catch(NumberFormatException e)
				{
					System.out.println("Not a valid number!");
				}
				catch(Exception e)
				{
					System.out.println("Please be serious!");
				}
		}
		while(!exit);
	}
	
	/**
	 * Ask the user input.
	 *
	 * @param sc   The scanner.
	 * @param text The text to display.
	 *
	 * @return The user input.
	 */
	private static String askLine(Scanner sc, String text)
	{
		System.out.print(text);
		return sc.nextLine();
	}
}
