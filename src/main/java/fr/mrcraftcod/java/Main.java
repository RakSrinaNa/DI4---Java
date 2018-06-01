package fr.mrcraftcod.java;

import fr.mrcraftcod.java.tp1.part1.Pay;
import fr.mrcraftcod.java.tp1.part2.Scheduler;
import fr.mrcraftcod.java.tp2.part1.Factorial;
import fr.mrcraftcod.java.tp2.part2.Menu;
import fr.mrcraftcod.java.tp3.part1.Notes;
import fr.mrcraftcod.java.tp3.part2.IntegerManager;
import fr.mrcraftcod.java.tp4.ex1.Linked;
import fr.mrcraftcod.java.tp5.ex1.DrawingParty;
import fr.mrcraftcod.java.tp5.ex2.ShelfManagement;
import java.util.Arrays;

/**
 * Main entry point.
 * <p>
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 19/04/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-04-19
 */
public class Main
{
	/**
	 * Selects the exercise to launch.
	 *
	 * @param args The first parameter is the name of the exercise as listed in the switch.
	 */
	public static void main(String[] args)
	{
		if(args.length > 0)
		{
			switch(args[0])
			{
				case "tp1-1":
					Pay.main(Arrays.copyOfRange(args, 1, args.length));
					break;
				case "tp1-2":
					Scheduler.main(Arrays.copyOfRange(args, 1, args.length));
					break;
				case "tp2-1":
					Factorial.main(Arrays.copyOfRange(args, 1, args.length));
					break;
				case "tp2-2":
					Menu.main(Arrays.copyOfRange(args, 1, args.length));
					break;
				case "tp3-1":
					Notes.main(Arrays.copyOfRange(args, 1, args.length));
					break;
				case "tp3-2":
					IntegerManager.main(Arrays.copyOfRange(args, 1, args.length));
					break;
				case "tp4-1":
					Linked.main(Arrays.copyOfRange(args, 1, args.length));
					break;
				case "tp4-2":
					break;
				case "tp4-3":
					break;
				case "tp5-1":
					DrawingParty.main(Arrays.copyOfRange(args, 1, args.length));
					break;
				case "tp5-2":
					ShelfManagement.main(Arrays.copyOfRange(args, 1, args.length));
					break;
				default:
					System.out.println("Not found");
			}
		}
	}
}
