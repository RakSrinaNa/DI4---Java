package fr.mrcraftcod.java.tp1.part2.shows;

import fr.mrcraftcod.java.tp1.part2.showtypes.EntertainmentShowType;

/**
 * Represents a video game show.
 * <p>
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 19/04/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-04-19
 */
public class VideoGameShow extends Show implements EntertainmentShowType
{
	/**
	 * Constructor.
	 *
	 * @param name The name of the show.
	 */
	public VideoGameShow(String name)
	{
		super(name, 2);
	}
}
