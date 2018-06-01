package fr.mrcraftcod.java.tp5.ex2;

import java.awt.*;

/**
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 24/05/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-05-24
 */
public class Pencil extends Article
{
	private Color color;
	
	/**
	 * Constructor.
	 *
	 * @param reference The article's reference.
	 * @param name      The name.
	 * @param brand     The brand.
	 * @param price     The unitary price.
	 * @param color     The color of the pencil.
	 */
	public Pencil(String reference, String name, String brand, double price, Color color)
	{
		super(reference, name, brand, price);
		this.color = color;
	}
	
	/**
	 * Get the color of the pen.
	 *
	 * @return The pen's color.
	 */
	public Color getColor()
	{
		return color;
	}
	
	/**
	 * Set the color of the pen.
	 *
	 * @param color The color to set.
	 */
	public void setColor(Color color)
	{
		this.color = color;
	}
}
