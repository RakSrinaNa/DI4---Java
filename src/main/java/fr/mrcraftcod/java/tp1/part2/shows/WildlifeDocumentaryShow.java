package fr.mrcraftcod.java.tp1.part2.shows;

import fr.mrcraftcod.java.tp1.part2.showtypes.ReportageShowType;

/**
 * Represents a wildlife documentary show.
 * <p>
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 19/04/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-04-19
 */
public class WildlifeDocumentaryShow extends Show implements ReportageShowType
{
	private String theme;
	
	/**
	 * Constructor.
	 *
	 * @param name   The name of the show.
	 * @param length The length of the show.
	 * @param theme  The theme of the reportage.
	 *
	 * @see Show#Show(String, int)
	 */
	public WildlifeDocumentaryShow(String name, int length, String theme)
	{
		super(name, length);
		this.theme = theme;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " - " + getTheme();
	}
	
	@Override
	public String getTheme()
	{
		return theme;
	}
	
	/**
	 * Set the theme of the reportage.
	 *
	 * @param theme The theme.
	 */
	public void setTheme(String theme)
	{
		this.theme = theme;
	}
}
