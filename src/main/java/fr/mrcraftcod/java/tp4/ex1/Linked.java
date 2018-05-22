package fr.mrcraftcod.java.tp4.ex1;

import java.util.*;
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
		list.addAll(List.of("Rouge", "Vert", "Bleu", "Jaune", "Noir"));
		System.out.println(list.stream().collect(Collectors.joining(", ")));
		System.out.println(IntStream.range(Integer.parseInt(askLine(sc, "Start at?: ")), list.size()).mapToObj(list::get).collect(Collectors.joining(", ")));
		System.out.println(list.stream().sorted(Collections.reverseOrder()).collect(Collectors.joining(", ")));
		list.add(Integer.parseInt(askLine(sc, "Position:")), askLine(sc, "What do we add?: "));
		list.add(0, askLine(sc, "Add to head?: "));
		list.add(askLine(sc, "Add to tail?: "));
		System.out.println(IntStream.range(0, list.size()).mapToObj(i -> i + ": " + list.get(i)).collect(Collectors.joining(",")));
		System.out.println("In list?: " + list.contains(askLine(sc, "Seek for?: ")));
		System.out.println("Deleted?: " + list.remove(askLine(sc, "Delete element?: ")));
		System.out.println("Deleted first?: " + list.removeFirst());
		Collections.swap(list, list.indexOf(askLine(sc, "First to swap?: ")), list.indexOf(askLine(sc, "Second to swap?: ")));
		Collections.shuffle(list);
		LinkedList<String> copy = new LinkedList<>(list);
		System.out.println("Deleted first?: " + list.removeFirst());
		System.out.println("First element: " + list.peekFirst());
		System.out.println("Last element: " + list.peekLast());
		System.out.println("Replaced: " + list.set(Integer.parseInt(askLine(sc, "Position to modify: ")), askLine(sc, "New element?: ")));
		ArrayList<String> list2 = new ArrayList<>(list);
		System.out.println("Is empty?: " + list.isEmpty());
		System.out.println("Same lists?: " + list.equals(copy));
		System.out.println("Same lists?: " + list.equals(list2));
		
		boolean exit = false;
		list.clear();
		do
		{
			try
			{
				switch(askLine(sc, "Enter your command: "))
				{
					case "empty":
						list.clear();
						break;
					case "addAll":
						list.addAll(Arrays.asList(askLine(sc, "What to add (separate by space)?: ").split(" ")));
						break;
					case "add":
						list.add(askLine(sc, "What to add (separate by space)?: "));
						break;
					case "addAt":
						list.add(Integer.parseInt(askLine(sc, "Position:")), askLine(sc, "What do we add?: "));
						break;
					case "addHead":
						list.addFirst(askLine(sc, "Add to head?: "));
						break;
					case "addTail":
						list.addLast(askLine(sc, "Add to tail?: "));
						break;
					case "print":
					case "show":
						System.out.println(list.stream().collect(Collectors.joining(", ")));
						break;
					case "printAt":
					case "showAt":
						System.out.println(IntStream.range(Integer.parseInt(askLine(sc, "Start at?: ")), list.size()).mapToObj(list::get).collect(Collectors.joining(", ")));
						break;
					case "printFull":
					case "showFull":
						System.out.println(IntStream.range(0, list.size()).mapToObj(i -> i + ": " + list.get(i)).collect(Collectors.joining(", ")));
						break;
					case "contains":
						System.out.println("In list?: " + list.contains(askLine(sc, "Seek for?: ")));
						break;
					case "delete":
						System.out.println("Deleted?: " + list.remove(askLine(sc, "Delete element?: ")));
						break;
					case "deleteFirst":
						System.out.println("Deleted?: " + list.removeFirst());
						break;
					case "swap":
						Collections.swap(list, list.indexOf(askLine(sc, "First to swap?: ")), list.indexOf(askLine(sc, "Second to swap?: ")));
						break;
					case "shuffle":
						Collections.shuffle(list);
						break;
					case "first":
						System.out.println("First element: " + list.peekFirst());
						break;
					case "last":
						System.out.println("Last element: " + list.peekLast());
						break;
					case "printReverse":
					case "showReverse":
						System.out.println(IntStream.iterate(list.size() - 1, i -> i - 1).limit(list.size()).mapToObj(list::get).collect(Collectors.joining(", ")));
						break;
					case "modify":
					case "change":
						System.out.println("Replaced: " + list.set(Integer.parseInt(askLine(sc, "Position to modify: ")), askLine(sc, "New element?: ")));
						break;
					case "isEmpty":
						System.out.println("Empty?: " + list.isEmpty());
						break;
					case "equals":
					case "same":
						System.out.println("Is same?: " + list.equals(Arrays.asList(askLine(sc, "Elements of list (separate with space)?: ").split(" "))));
						break;
					case "exit":
					case "quit":
						exit = true;
						System.out.println("Goodbye my lover");
						break;
					default:
						System.out.println("Unknown command, try again");
						break;
				}
			}
			catch(IndexOutOfBoundsException e)
			{
				System.out.println("Given index is not valid");
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
