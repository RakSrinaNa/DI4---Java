package fr.mrcraftcod.java.tp4.ex1;

import fr.mrcraftcod.java.utils.Menu;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 22/05/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-05-22
 */
public class Linked
{
	/**
	 * @param args Not used.
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		final LinkedList<String> list = new LinkedList<>();
		
		// try
		// {
		// 	list.addAll(List.of("Rouge", "Vert", "Bleu", "Jaune", "Noir"));
		// 	System.out.println(list.stream().collect(Collectors.joining(", ")));
		// 	System.out.println(IntStream.range(Integer.parseInt(askLine(sc, "Start at?: ")), list.size()).mapToObj(list::get).collect(Collectors.joining(", ")));
		// 	System.out.println(list.stream().sorted(Collections.reverseOrder()).collect(Collectors.joining(", ")));
		// 	list.add(Integer.parseInt(askLine(sc, "Position:")), askLine(sc, "What do we add?: "));
		// 	list.add(0, askLine(sc, "Add to head?: "));
		// 	list.add(askLine(sc, "Add to tail?: "));
		// 	System.out.println(IntStream.range(0, list.size()).mapToObj(i -> i + ": " + list.get(i)).collect(Collectors.joining(",")));
		// 	System.out.println("In list?: " + list.contains(askLine(sc, "Seek for?: ")));
		// 	System.out.println("Deleted?: " + list.remove(askLine(sc, "Delete element?: ")));
		// 	System.out.println("Deleted first?: " + list.removeFirst());
		// 	Collections.swap(list, list.indexOf(askLine(sc, "First to swap?: ")), list.indexOf(askLine(sc, "Second to swap?: ")));
		// 	Collections.shuffle(list);
		// 	LinkedList<String> copy = new LinkedList<>(list);
		// 	System.out.println("Deleted first?: " + list.removeFirst());
		// 	System.out.println("First element: " + list.peekFirst());
		// 	System.out.println("Last element: " + list.peekLast());
		// 	System.out.println("Replaced: " + list.set(Integer.parseInt(askLine(sc, "Position to modify: ")), askLine(sc, "New element?: ")));
		// 	ArrayList<String> list2 = new ArrayList<>(list);
		// 	System.out.println("Is empty?: " + list.isEmpty());
		// 	System.out.println("Same lists?: " + list.equals(copy));
		// 	System.out.println("Same lists?: " + list.equals(list2));
		// }
		// catch(Exception e)
		// {
		// 	System.out.println("Oh come on, please don't try to f*ck me");
		// }
		
		list.clear();
		
		Menu menu = new Menu();
		menu.addAction("Empty the list", list::clear);
		menu.addAction("Add several elements", () -> list.addAll(Arrays.asList(askLine(sc, "What to add (separate by space)?: ").split(" "))));
		menu.addAction("Add an element", () -> list.add(askLine(sc, "What to add (separate by space)?: ")));
		menu.addAction("Add an element at the given position", () -> list.add(Integer.parseInt(askLine(sc, "Position:")), askLine(sc, "What do we add?: ")));
		menu.addAction("Add at the head", () -> list.addFirst(askLine(sc, "Add to head?: ")));
		menu.addAction("Add at the tail", () -> list.addLast(askLine(sc, "Add to tail?: ")));
		menu.addAction("Modify an element in the list", () -> System.out.println("Replaced: " + list.set(Integer.parseInt(askLine(sc, "Position to modify: ")), askLine(sc, "New element?: "))));
		menu.addAction("Swap 2 elements", () -> Collections.swap(list, list.indexOf(askLine(sc, "First to swap?: ")), list.indexOf(askLine(sc, "Second to swap?: "))));
		menu.addAction("Delete an element", () -> System.out.println("Deleted?: " + list.remove(askLine(sc, "Delete element?: "))));
		menu.addAction("Delete the first element", () -> System.out.println("Deleted?: " + list.removeFirst()));
		menu.addAction("Delete the last element", () -> System.out.println("Deleted?: " + list.removeLast()));
		menu.addAction("Print the list", () -> System.out.println(String.join(", ", list)));
		menu.addAction("Print the list starting at a given position", () -> System.out.println(IntStream.range(Integer.parseInt(askLine(sc, "Start at?: ")), list.size()).mapToObj(list::get).collect(Collectors.joining(", "))));
		menu.addAction("Print with indexes", () -> System.out.println(IntStream.range(0, list.size()).mapToObj(i -> i + ": " + list.get(i)).collect(Collectors.joining(", "))));
		menu.addAction("Print the list reversed", () -> System.out.println(IntStream.iterate(list.size() - 1, i -> i - 1).limit(list.size()).mapToObj(list::get).collect(Collectors.joining(", "))));
		menu.addAction("Show the first element", () -> System.out.println("First element: " + list.peekFirst()));
		menu.addAction("Show the last element", () -> System.out.println("Last element: " + list.peekLast()));
		menu.addAction("Test if the list contains an element", () -> System.out.println("In list?: " + list.contains(askLine(sc, "Seek for?: "))));
		menu.addAction("Shuffle", () -> Collections.shuffle(list));
		menu.addAction("Check if the list is empty", () -> System.out.println("Empty?: " + list.isEmpty()));
		menu.addAction("Compare with another list", () -> System.out.println("Is same?: " + list.equals(Arrays.asList(askLine(sc, "Elements of list (separate with space)?: ").split(" ")))));
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
