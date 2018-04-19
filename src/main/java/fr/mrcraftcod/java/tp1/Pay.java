package fr.mrcraftcod.java.tp1;

import fr.mrcraftcod.java.tp1.employees.Collaborator;
import fr.mrcraftcod.java.tp1.employees.Employee;
import fr.mrcraftcod.java.tp1.employees.Trader;
import fr.mrcraftcod.java.tp1.employees.Worker;
import java.util.ArrayList;

/**
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 19/04/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-04-19
 */
public class Pay
{
	public static void main(String[] args)
	{
		System.out.println("Executing TP1\n");
		
		var employees = new ArrayList<Employee>();
		employees.add(new Trader("Trader", "1", 1000));
		employees.add(new Trader("Trader", "2", 2000));
		employees.add(new Worker("Worker", "1", 35));
		employees.add(new Worker("Worker", "2", 25));
		employees.add(new Worker("Worker", "3", 45));
		employees.add(new Collaborator("Collaborator", "1", 37, 4000));
		
		System.out.format("%-30s | %-15s | %-9s\n", "Name", "Type", "Wage");
		System.out.format("%.60s\n", "-----------------------------------------------------------------------------------------------------------------------------------------------------------");
		employees.forEach(e -> System.out.format("%-30s | %-15s | %6.2f\n", e, e.getClass().getSimpleName(), e.getWage()));
	}
}
