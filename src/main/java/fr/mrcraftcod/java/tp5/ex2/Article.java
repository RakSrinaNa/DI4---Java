package fr.mrcraftcod.java.tp5.ex2;

/**
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 24/05/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-05-24
 */
public abstract class Article
{
	private final String reference;
	private String name;
	private String brand;
	private double price;
	
	/**
	 * Constructor.
	 *
	 * @param reference The article's reference.
	 * @param name      The name.
	 * @param brand     The brand.
	 * @param price     The unitary price.
	 */
	public Article(String reference, String name, String brand, double price)
	{
		this.reference = reference;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	
	/**
	 * Get the brand of the article.
	 *
	 * @return The article's brand.
	 */
	public String getBrand()
	{
		return brand;
	}
	
	/**
	 * Set the brand of the article.
	 *
	 * @param brand The brand to set.
	 */
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	
	/**
	 * Get the name of the article.
	 *
	 * @return The article's name.
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Set the name of the article.
	 *
	 * @param name The name to set.
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Get the price of the article.
	 *
	 * @return The article's price.
	 */
	public double getPrice()
	{
		return price;
	}
	
	/**
	 * Set the price of the article.
	 *
	 * @param price The article's price.
	 *
	 * @throws IllegalArgumentException If the price isn't positive.
	 */
	public void setPrice(double price) throws IllegalArgumentException
	{
		if(price < 0)
			throw new IllegalArgumentException("Price must be positive");
		this.price = price;
	}
	
	/**
	 * Get the reference of the article.
	 *
	 * @return The article's reference.
	 */
	public String getReference()
	{
		return reference;
	}
}
