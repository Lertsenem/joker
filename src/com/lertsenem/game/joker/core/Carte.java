/**
 */

// IMPORTS
import java.lang.String;
import java.util.HashMap;


/**
 * The <code>Carte</code> class, modelling a <strong>card</strong>.
 */
class Carte()
{
	// ##################################################### //	
	// PROPERTIES
	// ##################################################### //	
	/**
	 * Unique identifier for the <code>Carte</code>.
	 */
	private Identifiant id;
	
	/**
	 * <code>Orientation</code> of the <code>Carte</code>
	 */
	private Orientation orientation;

	/**
	 * <code>Inclinaison<code> of the <code>Carte</code>
	 */
	private Inclinaison inclinaison;

	/**
	 * <code>Paquet</code> to wich belongs the <code>Carte</code>
	 */
	private Paquet paquet;

	/**
	 * The <code>Hashmap</code> containing the <strong>literal</strong> properties of the <code>Carte</code>
	 */
	private HashMap<String,String> proprietesLitterales;

	/**
	 * The <code>Hashmap</code> containing the <strong>numeric</strong> properties of the <code>Carte</code>
	 */
	private HashMap<String,String> proprietesNumeriques;


	// ##################################################### //	
	// METHODS
	// ##################################################### //	

	/**
	 * Constructor
	 */
	public Carte(Identifiant id, Paquet paquet)
	{
		this.id = id;

		this.paquet = paquet;

		this.orientation = paquet.getDefaultOrientation();
		this.inclinaison = paquet.getDefaultInclinaison();
	}

	// ===================================================== //	
	// Getters
	// ===================================================== //	
	/**
	 * Getter for <code>id</code>.
	 *
	 * @return id
	 */
	public Identifiant getId()
	{
		return id;
	}

	/**
	 * Getter for <code>orientation</code>.
	 *
	 * @return orientation
	 */
	public Orientation getOrientation()
	{
		return orientation;
	}

	/**
	 * Getter for <code>inclinaison</code>.
	 *
	 * @return inclinaison
	 */
	public Inclinaison getInclinaison()
	{
		return inclinaison;
	}

	/**
	 * Getter for <code>paquet</code>.
	 *
	 * @return paquet
	 */
	public Paquet getPaquet()
	{
		return paquet;
	}

	// ===================================================== //	
	// Setters
	// ===================================================== //
	/**
	 * Setter for id
	 *
	 * @param id the new id to set
	 */
	private void setId( Identifiant id )
	{
		this.id = id;
		return;
	}
	
	/**
	 * Setter for orientation.
	 *
	 * @param orientation the new orientation
	 */
	public void setOrientation( Orientation orientation )
	{
		this.orientation = orientation;
		return;
	}
	
	/**
	 * Setter for inclinaison.
	 *
	 * @param inclinaison the new inclinaison
	 */
	public void setInclinaison( Inclinaison inclinaison )
	{
		this.inclinaison = inclinaison;
		return;
	}
	
	/**
	 * Setter for paquet.
	 *
	 * @param paquet the new paquet
	 */
	public void setPaquet( Paquet paquet )
	{
		this.paquet = paquet;
		return;
	}
}
