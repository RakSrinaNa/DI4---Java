package fr.mrcraftcod.java.tp5.ex1;

import java.util.ArrayList;
import java.util.Optional;

/**
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 24/05/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-05-24
 */
public class CompositeDrawable extends Drawable
{
	private final ArrayList<Drawable> children;
	
	/**
	 * Constructor.
	 */
	public CompositeDrawable()
	{
		super();
		children = new ArrayList<>();
	}
	
	@Override
	public void draw()
	{
		children.forEach(Drawable::draw);
	}
	
	@Override
	public void translate(int x, int y)
	{
		children.forEach(c -> c.translate(x, y));
	}
	
	/**
	 * Add an element to this drawable.
	 *
	 * @param drawable The element to add.
	 */
	public void add(Drawable drawable)
	{
		children.add(drawable);
	}
	
	/**
	 * Remove an element to this drawable.
	 *
	 * @param drawable The element to remove.
	 */
	public void remove(Drawable drawable)
	{
		children.remove(drawable);
	}
	
	/**
	 * Get the element at the given index.
	 *
	 * @param index The index to request.
	 *
	 * @return An optional of the requested element.
	 */
	public Optional<Drawable> getChildAt(int index)
	{
		return index >= 0 && index < children.size() ? Optional.of(children.get(index)) : Optional.empty();
	}
	
	/**
	 * Get the number of children.
	 *
	 * @return The number of children.
	 */
	public int getChildCount()
	{
		return children.size();
	}
}
