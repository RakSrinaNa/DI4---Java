package fr.mrcraftcod.java.tp5.ex1;

/**
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 24/05/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-05-24
 */
public class Point extends Drawable
{
	
	@Override
	public void draw()
	{
		System.out.println(".");
	}
	
	@Override
	public void translate(int x, int y)
	{
		System.out.format("Point translated x: %d, y: %d\n", x, y);
	}
}
