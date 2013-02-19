/**
 */

// IMPORTS
import java.lang.String;
import java.util.HashMap;


/**
 * The <code>Identifiant</code> class is a user-defined unique identifiant.
 */
class Identifiant()
{
	// ##################################################### //	
	// PROPERTIES
	// ##################################################### //

	/**
	 * The <code>Identifiant</code> value.
	 */
	private String value;

	/**
	 * The <code>Ressource</code> associated with the <code>Identifiant</code>.
	 */
	private Ressource ressource;

	// ##################################################### //	
	// METHODS
	// ##################################################### //	

	/**
	 * Constructor<br/>
	 * Build an unassociated <code>Identifiant</code>.
	 *
	 * @param value the <code>Identifiant</code> value
	 */
	public Identifiant(String value)
	{
		this.value = value;

		this.ressource = void;
	}

	/**
	 * Constructor
	 *
	 * @param value		the <code>Identifiant</code> value
	 * @param ressource	the <code>Ressource</code> to associate with the <code>Identifiant</code>.
	 */
	public Identifiant(String value, Ressource ressource)
	{
		this.value = value;

		this.ressource = ressource;
	}

	// ===================================================== //	
	// Getters
	// ===================================================== //	
	

	/**
	 * Getter for <code>value</code>.
	 *
	 * @return value
	 */
	public String getValue()
	{
		return value;
	}

	/**
	 * Getter for <code>ressource</code>.
	 *
	 * @return ressource
	 */
	public Ressource getRessource()
	{
		return ressource;
	}

	// ===================================================== //	
	// Setters
	// ===================================================== //
	
	/**
	 * Setter for ressource.
	 *
	 * @param ressource the new ressource
	 */
	public void setRessource( Ressource ressource )
	{
		// Checks that the resource is not already set
		if (this.ressource != null)
		{
			return;
		}

		this.ressource = ressource;
		return;
	}

}
