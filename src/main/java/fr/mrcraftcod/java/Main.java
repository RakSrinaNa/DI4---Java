package fr.mrcraftcod.java;

import fr.mrcraftcod.java.tp1.Pay;
import java.util.Arrays;

/**
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 19/04/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-04-19
 */
public class Main
{
	public static void main(String[] args)
	{
		if(args.length > 0)
		{
			switch(args[0])
			{
				case "tp1":
					Pay.main(Arrays.copyOfRange(args, 1, args.length));
			}
		}
	}
}
