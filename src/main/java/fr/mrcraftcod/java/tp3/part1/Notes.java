package fr.mrcraftcod.java.tp3.part1;

import fr.mrcraftcod.java.utils.Menu;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 15/05/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-05-15
 */
public class Notes
{
	/**
	 * @param args List size.
	 */
	public static void main(String[] args)
	{
		ArrayList<Double> grades = new ArrayList<>();
		ArrayList<Integer> coeffs = new ArrayList<>();
		// addGrade(grades, coeffs, 12, 1);
		// addGrade(grades, coeffs, 14, 1);
		// addGrade(grades, coeffs, 9, 1);
		// printGrades(System.out, grades, coeffs);
		// System.out.println("Average: " + getAverage(grades, coeffs));
		// addGrade(grades, coeffs, 13, 1);
		// printGrades(System.out, grades, coeffs);
		// System.out.println("Average: " + getAverage(grades, coeffs));
		
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();
		menu.addAction("Add", () -> addGrade(grades, coeffs, Double.parseDouble(askLine(sc, "Enter the grade: ")), Integer.parseInt(askLine(sc, "Enter the coefficient: "))));
		menu.addAction("List", () -> printGrades(System.out, grades, coeffs));
		menu.addAction("Modify a grade", () -> modifyNote(grades, coeffs, Integer.parseInt(askLine(sc, "Enter the position of the grade to change: ")), Double.parseDouble(askLine(sc, "Enter the new grade to set: ")), Integer.parseInt(askLine(sc, "Enter the new coefficient to set: "))));
		menu.addAction("Average", () -> System.out.println(getAverage(grades, coeffs)));
		menu.run();
	}
	
	/**
	 * Add a grade to the list.
	 *
	 * @param grades The list of grades.
	 * @param coeffs The list of coefficients.
	 * @param grade  The grade to add.
	 * @param coeff  The coeff to add.
	 */
	private static void addGrade(ArrayList<Double> grades, ArrayList<Integer> coeffs, double grade, int coeff)
	{
		if(grades == null)
			throw new IllegalArgumentException("List is null");
		grades.add(grade);
		coeffs.add(coeff);
	}
	
	/**
	 * Add a grade to the list.
	 *
	 * @param out    Where to print.
	 * @param grades The list of grades.
	 * @param coeffs The list of coefficients.
	 */
	private static void printGrades(PrintStream out, ArrayList<Double> grades, ArrayList<Integer> coeffs)
	{
		out.println(IntStream.range(0, grades.size()).mapToObj(i -> String.format("Pos %d : {note: %.2f, coeff: %d}", i, grades.get(i), coeffs.get(i))).collect(Collectors.joining("\n")));
	}
	
	/**
	 * Get the average.
	 *
	 * @param grades The list of grades.
	 * @param coeffs The list of coefficients.
	 *
	 * @return The average.
	 */
	private static double getAverage(ArrayList<Double> grades, ArrayList<Integer> coeffs)
	{
		if(grades == null)
			throw new IllegalArgumentException("List is null");
		if(grades.size() == 0)
			throw new IllegalArgumentException("List is empty");
		return IntStream.range(0, grades.size()).mapToDouble(i -> coeffs.get(i) * grades.get(i)).sum() / coeffs.stream().mapToInt(i -> i).sum();
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
	
	/**
	 * Modify a grade.
	 *
	 * @param grades   The grades.
	 * @param coeffs   The coefficients.
	 * @param pos      The position to modify.
	 * @param newGrade The new grade to set.
	 * @param newCoeff The new coefficient to set.
	 */
	private static void modifyNote(ArrayList<Double> grades, ArrayList<Integer> coeffs, int pos, double newGrade, int newCoeff)
	{
		if(grades == null)
			throw new IllegalArgumentException("List is null");
		if(grades.size() == 0)
			throw new IllegalArgumentException("List is empty");
		if(pos < 0 || pos >= grades.size())
			throw new IndexOutOfBoundsException(pos + " is out of the array (from 0 to " + (grades.size() - 1) + ")");
		grades.set(pos, newGrade);
		coeffs.set(pos, newCoeff);
	}
}
