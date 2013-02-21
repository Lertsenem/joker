/**
 */

// IMPORTS
import java.lang.String;
import java.util.HashMap;


/**
 * The <code>Orientation</code> class models an orientation - for now visible or hidden.
 */
public class Orientation
{
	// ##################################################### //	
	// CONSTANTS
	// ##################################################### //

	public static final VISIBLE	= 0x0;
	public static final RECTO	= VISIBLE;

	public static final CACHE	= 0x1;
	public static final HIDDEN	= CACHE;
	public static final VERSO	= CACHE;

	// ##################################################### //	
	// PROPERTIES
	// ##################################################### //

	/**
	 * The <code>Orientation</code> value.
	 */
	private short value;

	// ##################################################### //	
	// METHODS
	// ##################################################### //	

	/**
	 * Constructor<br/>
	 */
	public Orientation()
	{
		this.value = Orientation.VISIBLE;
	}


	// ===================================================== //	
	// Getters
	// ===================================================== //	

	/**
	 * Getter for <code>value</code>.
	 *
	 * @return value
	 */
	public short getValue()
	{
		return value;
	}

	// ===================================================== //	
	// Setters
	// ===================================================== //
	
	/**
	 * Setter for value.
	 *
	 * @param value the new value
	 */
	public void setValue( short value )
	{
		if
		(
			value != Orientation.VISIBLE &&
			value != Orientation.HIDDEN
		)
		{
			return;
		}

		this.value = value;
		return;
	}
}
