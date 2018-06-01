package fr.mrcraftcod.java.tp5.ex2;

/**
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 24/05/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-05-24
 */
public class ArticleBatch extends Article
{
	private final Article article;
	private int quantity;
	private double percentage;
	
	/**
	 * Constructor.
	 *
	 * @param reference  The batch reference.
	 * @param article    The article in the batch.
	 * @param percentage The percentage of discount given for this batch.
	 */
	public ArticleBatch(String reference, Article article, double percentage)
	{
		super(reference, article.getName(), article.getBrand(), article.getPrice());
		this.article = article;
		this.quantity = 0;
		this.percentage = percentage;
	}
	
	/**
	 * Get the percentage of the batch.
	 *
	 * @return The batch's percentage.
	 */
	public double getPercentage()
	{
		return percentage;
	}
	
	/**
	 * Set the batch percentage.
	 *
	 * @param percentage The percentage to set.
	 */
	public void setPercentage(double percentage)
	{
		this.percentage = percentage;
	}
	
	/**
	 * Get the quantity of the batch.
	 *
	 * @return The batch's quantity.
	 */
	public int getQuantity()
	{
		return quantity;
	}
	
	/**
	 * Set the batch's quantity.
	 *
	 * @param quantity The quantity to set.
	 *
	 * @throws IllegalArgumentException If the quantity isn't positive.
	 */
	public void setQuantity(int quantity) throws IllegalArgumentException
	{
		if(quantity < 0)
			throw new IllegalArgumentException("Quantity must be positive");
		this.quantity = quantity;
		setName("Batch of " + getQuantity() + " " + article.getName());
		setPrice(article.getPrice() * getQuantity() * (1 - getPercentage()));
	}
}
