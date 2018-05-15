package fr.mrcraftcod.java.tp3.part2;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 15/05/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-05-15
 */
public class IntegerManager
{
	public static void main(String[] args)
	{
		List<Integer> list1 = newSingletonList(5);
		addElement(list1, 6);
		printList(System.out, "list1: ", list1);
		
		List<Integer> list2 = newSingletonList(7);
		addElement(list2, 8);
		addElement(list2, 5);
		printList(System.out, "list2: ", list2);
		
		List<Integer> list3 = union(list1, list2);
		printList(System.out, "union: ", list3);
		
		List<Integer> list4 = intersect(list1, list2);
		printList(System.out, "intersection: ", list4);
		
		System.out.println("6 in list 1: " + isIn(list1, 6));
		System.out.println("6 in list 2: " + isIn(list2, 6));
		
		System.out.println("list1 size: " + size(list1));
		System.out.println("list2 size: " + size(list2));
		System.out.println("list3 size: " + size(list3));
		System.out.println("list4 size: " + size(list4));
	}
	
	private static List<Integer> newSingletonList(int value)
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(value);
		return list;
	}
	
	private static void addElement(List<Integer> list, int value)
	{
		list.add(value);
	}
	
	private static void printList(PrintStream out, String prefix, List<Integer> collection)
	{
		out.println(prefix + collection.stream().map(Object::toString).collect(Collectors.joining(", ")));
	}
	
	private static List<Integer> union(List<Integer> list1, List<Integer> list2)
	{
		return Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
	}
	
	private static List<Integer> intersect(List<Integer> list1, List<Integer> list2)
	{
		return list1.stream().filter(list2::contains).collect(Collectors.toList());
	}
	
	private static boolean isIn(List<Integer> list, int value)
	{
		return list.contains(value);
	}
	
	private static int size(List<Integer> list)
	{
		return list.size();
	}
}
