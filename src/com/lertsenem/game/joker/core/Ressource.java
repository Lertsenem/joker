/**
 * The <code>Ressource</code> abstract class describes an object with
 * an <code>Identifiant</code> and numeric and literal properties.
 */
public abstract class Ressource
{

	// ##################################################### //	
	// PROPERTIES
	// ##################################################### //	
	/**
	 * The <code>Identifiant</code> of the <code>Paquet</code>
	 */
	private Identifiant id = null;

	/**
	 * The <code>Hashmap</code> containing the <strong>literal</strong> properties of the <code>Carte</code>
	 */
	private HashMap<String, String> proprietesLitterales;

	/**
	 * The <code>Hashmap</code> containing the <strong>numeric</strong> properties of the <code>Carte</code>
	 */
	private HashMap<String, Integer> proprietesNumeriques;

	// ##################################################### //	
	// METHODS
	// ##################################################### //	

	// ===================================================== //	
	// Getters
	// ===================================================== //	

	/**
	 * Get the <code>Identifiant</code> associated withi the <code>Ressource</code>
	 */
	public Identifiant getId();
	{
		return this.id;
	}
	
	/**
	 * Get a <code>Ressource</code> literal property.
	 */
	public String getProprieteLitterale(String propriete);
	{
		return proprietesLitterales.get(propriete);
	}
	
	/**
	 * Get a <code>Ressource</code> numeric property.
	 */
	public int getProprieteNumerique(String propriete);
	{
		return proprietesNumeriques.get(propriete);
	}


	// ===================================================== //	
	// Setters
	// ===================================================== //
	
	/**
	 * Setter for <code>id</code>.
	 *
	 * @param id the new id
	 */
	public void setId( Identifiant id )
	{
		if (this.id != null)
		{
			return;
		}

		this.id = id;
		return;
	}
	
	/**
	 * Set a <code>Ressource</code> literal property.
	 */
	public String setProprieteLitterale(String propriete, String value);
	{
		return proprietesLitterales.put(propriete, value);
	}
	
	/**
	 * Set a <code>Ressource</code> numeric property.
	 */
	public Integer setProprieteNumerique(String propriete, Integer value);
	{
		return proprietesNumeriques.put(propriete, value);
	}



}
