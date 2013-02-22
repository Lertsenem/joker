/**
 * The <code>Paquet</code> class models a card deck.
 */
public class Paquet extends Ressource
{
	// ##################################################### //	
	// PROPERTIES
	// ##################################################### //

	private List cartes;

	// ##################################################### //	
	// METHODS
	// ##################################################### //	

	/**
	 * Constructor<br/>
	 */
	public Paquet( Identifiant id )
	{
		this.id = id;
	}

	// ===================================================== //	
	// Getters
	// ===================================================== //	

	public Carte getCarteAt(int index)
	{
		return (Carte) cartes.get(index);
	}

	// ===================================================== //	
	// Setters
	// ===================================================== //

	public void insertCarteAt(int index, Carte carte)
	{
		cartes.add(index, carte);
	}
}
