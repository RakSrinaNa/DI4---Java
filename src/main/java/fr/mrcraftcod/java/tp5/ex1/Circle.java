package fr.mrcraftcod.java.tp5.ex1;

/**
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 24/05/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-05-24
 */
public class Circle extends Drawable
{
	@Override
	public void draw()
	{
		System.out.println("o");
	}
	
	@Override
	public void translate(int x, int y)
	{
		System.out.format("Circle translated x: %d, y: %d\n", x, y);
	}
}
