package fr.mrcraftcod.java.tp6.ex2;

import fr.mrcraftcod.java.utils.Menu;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 01/06/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-06-01
 */
public class SetParty
{
	/**
	 * @param args Not used.
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		TabSet<String> set = new TabSet<>();
		Menu menu = new Menu();
		menu.addAction("Add element", () -> System.out.println("Added?: " + set.add(askLine(sc, "Element to add: "))));
		menu.addAction("Add elements", () -> System.out.println("At least one added?: " + set.addAll(Arrays.asList(askLine(sc, "Elements to add (separated by spaces): ").split(" ")))));
		menu.addAction("Contains element", () -> System.out.println("Contains?: " + set.contains(askLine(sc, "Element to test: "))));
		menu.addAction("Contains elements", () -> System.out.println("All are contained?: " + set.containsAll(Arrays.asList(askLine(sc, "Elements to test (separated by spaces): ").split(" ")))));
		menu.addAction("Remove element", () -> System.out.println("Removed?: " + set.remove(askLine(sc, "Element to remove: "))));
		menu.addAction("Remove elements", () -> System.out.println("At least one removed?: " + set.removeAll(Arrays.asList(askLine(sc, "Elements to remove (separated by spaces): ").split(" ")))));
		menu.addAction("Keep only elements", () -> System.out.println("At least one removed?: " + set.retainAll(Arrays.asList(askLine(sc, "Elements to keep (separated by spaces): ").split(" ")))));
		menu.addAction("Clear", set::clear);
		menu.addAction("As array", () -> System.out.println("As array: " + Arrays.toString(set.toArray())));
		menu.addAction("Get size", () -> System.out.println("Size: " + set.size()));
		menu.addAction("Empty?", () -> System.out.println("Is empty: " + set.isEmpty()));
		menu.addAction("Get real size", () -> System.out.println("Real size: " + set.realSize()));
		menu.addAction("Get real array", () -> System.out.println("Real array: " + Arrays.toString(set.realArray())));
		menu.run();
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
