package fr.mrcraftcod.java.tp5.ex2;

import java.util.List;

/**
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 24/05/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-05-24
 */
public class ShelfManagement
{
	/**
	 * @param args Not used.
	 */
	public static void main(String[] args)
	{
		Pencil p = new Pencil("REF1", "Pencil of the death", "El diablo", 100, java.awt.Color.RED);
		PaperRack pr = new PaperRack("REF2", "Cascade Style Sheet", "HyperText Markup Language", 0.1, 400);
		ArticleBatch pb = new ArticleBatch("REF3", p, 0.8);
		pb.setQuantity(34098);
		ArticleBatch prb = new ArticleBatch("REF4", pr, 0.1);
		prb.setQuantity(1234567890);
		List.of(p, pr, pb, prb).forEach(a -> System.out.format("Reference: %s\nName: %s\nPrice: %.2f\nBrand: %s\n\n", a.getReference(), a.getName(), a.getPrice(), a.getBrand()));
	}
}

