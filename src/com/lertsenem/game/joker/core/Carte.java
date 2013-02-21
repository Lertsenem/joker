/**
 */

// IMPORTS
import java.lang.String;
import java.util.HashMap;


/**
 * The <code>Carte</code> class, modelling a <strong>card</strong>.
 */
public class Carte extends Resources
{
	// ##################################################### //	
	// PROPERTIES
	// ##################################################### //	
	
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

	// ##################################################### //	
	// METHODS
	// ##################################################### //	

	/**
	 * Constructor
	 */
	public Carte(Identifiant id, Paquet paquet)
	{
		this.setId(id);

		this.paquet = paquet;

		this.orientation = paquet.getDefaultOrientation();
		this.inclinaison = paquet.getDefaultInclinaison();
	}

	// ===================================================== //	
	// Getters
	// ===================================================== //	
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
