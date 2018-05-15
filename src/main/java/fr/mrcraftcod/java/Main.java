package fr.mrcraftcod.java;

import fr.mrcraftcod.java.tp1.part1.Pay;
import fr.mrcraftcod.java.tp1.part2.Scheduler;
import fr.mrcraftcod.java.tp2.part1.Factorial;
import fr.mrcraftcod.java.tp2.part2.Menu;
import fr.mrcraftcod.java.tp3.part1.Notes;
import fr.mrcraftcod.java.tp3.part2.IntegerManager;
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
			}
		}
	}
}
