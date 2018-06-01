package fr.mrcraftcod.java.tp5.ex2;

/**
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 24/05/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-05-24
 */
public class PaperRack extends Article
{
	private double density;
	
	/**
	 * Constructor.
	 *
	 * @param reference The article's reference.
	 * @param name      The name.
	 * @param brand     The brand.
	 * @param price     The unitary price.
	 * @param density   The paper density.
	 */
	public PaperRack(String reference, String name, String brand, double price, double density)
	{
		super(reference, name, brand, price);
		this.density = density;
	}
	
	/**
	 * Get the density of the paper.
	 *
	 * @return The paper's density.
	 */
	public double getDensity()
	{
		return density;
	}
	
	/**
	 * Set the paper's density.
	 *
	 * @param density The density to set.
	 */
	public void setDensity(double density)
	{
		this.density = density;
	}
}
