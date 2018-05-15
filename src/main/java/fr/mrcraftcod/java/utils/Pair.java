package fr.mrcraftcod.java.utils;

/**
 * Represent a pair of values.
 * <p>
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 23/04/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-04-23
 */
public class Pair<K, V>
{
	private final K key;
	private final V value;
	
	/**
	 * Constructor.
	 *
	 * @param key   The key.
	 * @param value The value.
	 */
	public Pair(K key, V value)
	{
		this.key = key;
		this.value = value;
	}
	
	/**
	 * Get the key.
	 *
	 * @return The key.
	 */
	public K getKey()
	{
		return key;
	}
	
	/**
	 * Get the value.
	 *
	 * @return The value.
	 */
	public V getValue()
	{
		return value;
	}
}
