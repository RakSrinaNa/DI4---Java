package fr.mrcraftcod.java.tp1.part2.shows;

import fr.mrcraftcod.java.tp1.part2.showtypes.FictionShowType;

/**
 * Represents a movie.
 * <p>
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 19/04/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-04-19
 */
public class MovieShow extends Show implements FictionShowType
{
	private int year;
	private String director;
	private boolean isRebroadcast;
	
	/**
	 * Constructor.
	 *
	 * @param name          The name of the manga.
	 * @param length        The length of the show.
	 * @param year          The length of the manga.
	 * @param director      The director of the manga.
	 * @param isRebroadcast If this show is a rebroadcast or not.
	 *
	 * @see Show#Show(String, int)
	 */
	public MovieShow(String name, int length, int year, String director, boolean isRebroadcast)
	{
		super(name, length);
		this.year = year;
		this.director = director;
		this.isRebroadcast = isRebroadcast;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " - " + getYear() + " / " + getDirectorName() + " / " + isRebroadcast();
	}
	
	@Override
	public boolean isRebroadcast()
	{
		return isRebroadcast;
	}
	
	@Override
	public String getDirectorName()
	{
		return director;
	}
	
	@Override
	public int getYear()
	{
		return year;
	}
	
	/**
	 * Set the year.
	 *
	 * @param year The year.
	 */
	public void setYear(int year)
	{
		this.year = year;
	}
	
	/**
	 * Set if a rebroadcast or not.
	 *
	 * @param rebroadcast The status of the rebroadcast.
	 */
	public void setRebroadcast(boolean rebroadcast)
	{
		isRebroadcast = rebroadcast;
	}
	
	/**
	 * Set the director.
	 *
	 * @param director The director.
	 */
	public void setDirector(String director)
	{
		this.director = director;
	}
}
