package samples.with.innerclasses;



import samples.with.innerclasses.Order.Item;
import java.math.BigDecimal;


/**
 * The {@link ItemBuilder} is a Builder for {@link Item} objects.
 *
 * @created  by the PojoBuilder generator
 */
public class ItemBuilder implements Cloneable {

	protected String value$title$java$lang$String; // mandatory constructor parameter
	protected boolean isSet$title$java$lang$String = false; 

	protected BigDecimal value$pricePerUnit$java$math$BigDecimal; // mandatory constructor parameter
	protected boolean isSet$pricePerUnit$java$math$BigDecimal = false; 

	protected int value$units$int; // mandatory constructor parameter
	protected boolean isSet$units$int = false; 



	/**
	 * Creates a new {@link ItemBuilder}.
	 */
	public ItemBuilder() {
	}

	/**
	 * Sets the default value for the {@link Item#title} property.
	 * @param value the default value
	 * @return this builder
	 */
	public ItemBuilder withTitle( String value) {
		this.value$title$java$lang$String = value;
		this.isSet$title$java$lang$String = true;
		return this;
	}
	/**
	 * Sets the default value for the {@link Item#pricePerUnit} property.
	 * @param value the default value
	 * @return this builder
	 */
	public ItemBuilder withPricePerUnit( BigDecimal value) {
		this.value$pricePerUnit$java$math$BigDecimal = value;
		this.isSet$pricePerUnit$java$math$BigDecimal = true;
		return this;
	}
	/**
	 * Sets the default value for the {@link Item#units} property.
	 * @param value the default value
	 * @return this builder
	 */
	public ItemBuilder withUnits( int value) {
		this.value$units$int = value;
		this.isSet$units$int = true;
		return this;
	}


	/**
	 * Returns a clone of this builder.
	 * @return the clone
	 */
	@Override	
	public Object clone() {
		try {
			Object result = super.clone();
			return result;
		} catch (CloneNotSupportedException e) {
			throw new InternalError(e.getMessage());
		}        
	}

	/**
	 * Returns a clone of this builder.
	 * @return the clone
	 */
	public ItemBuilder but() {
		return (ItemBuilder)clone();
	}

	/**
	 * Creates a new {@link Item} based on this builders settings.
	 * @return the created Item
	 */
	public Item build() {
		Item result = new Item( this.value$title$java$lang$String ,this.value$pricePerUnit$java$math$BigDecimal ,this.value$units$int );
		return result;
	}

}