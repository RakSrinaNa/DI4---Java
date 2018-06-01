package fr.mrcraftcod.java.tp5.ex1;

/**
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 24/05/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-05-24
 */
public class DrawingParty
{
	/**
	 * @param args Not used.
	 */
	public static void main(String[] args)
	{
		Circle c = new Circle();
		c.draw();
		c.translate(1, -1);
		Point p = new Point();
		p.draw();
		Line l = new Line();
		l.draw();
		CompositeDrawable cd = new CompositeDrawable();
		cd.draw();
		cd.add(p);
		cd.draw();
		cd.add(l);
		cd.draw();
		cd.add(c);
		cd.draw();
		cd.translate(2, 3);
		cd.remove(l);
		cd.draw();
	}
}
