/**
 * The <code>Inclinaison</code> class models an inclination - from 0° to 359°
 */
public class Orientation
{
	// ##################################################### //	
	// CONSTANTS
	// ##################################################### //

	public static final DROITE	= 0;

	public static final ENGAGEE	= 90;
	public static final ENGAGED	= ENGAGEE;

	public static final RETOURNEE	= 180;

	// ##################################################### //	
	// PROPERTIES
	// ##################################################### //

	/**
	 * The <code>Inclinaison</code> value.
	 */
	private short value;

	// ##################################################### //	
	// METHODS
	// ##################################################### //	

	/**
	 * Constructor<br/>
	 */
	public Inclinaison()
	{
		this.value = Inclinaison.DROITE;
	}

	/**
	 * Constructor<br/>
	 *
	 * @param value the <code>Inclinaison</code> value.
	 */
	public Inclinaison(short value)
	{
		this.setValue(value);
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
		this.value = value % 360;
		return;
	}
}
