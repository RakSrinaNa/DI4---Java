package fr.mrcraftcod.java.tp5.ex1;

/**
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 24/05/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-05-24
 */
public abstract class Drawable
{
	/**
	 * Draw the element.
	 */
	public abstract void draw();
	
	/**
	 * Translate the element.
	 *
	 * @param x Translation over x.
	 * @param y Translation over y.
	 */
	public abstract void translate(int x, int y);
}
