package classes;

public class Eleve {

	private int code;
	private String nom;
	private String prenom;
	private String dateNaiss;

	//Accesseurs

/**
 * Accesseur du code d'un eleve
* @return Code de l'eleve (int)
*/

		public int getcode()
		{
			return code;
		}

/**
* Accesseur du nom de l'eleve
* @return nom de l'eleve (String)
*/

		public String getnom()
		{
			return nom;
		}
		
/**
* Accesseur du prenom de l'eleve
* @return prenom de l'eleve (String)
*/

		public String getprenom()
		{
			return prenom;
		}

/**
* Accesseur de la date de naissance de l'eleve
* @return date de naissance de l'eleve (String)
*/

		public String getdateNaiss()
		{
			return dateNaiss;
		}
		
	//Modifieurs


		public void setcode(int code)
		{
			this.code = code;
		}

		public void setnom(String nom)
		{
			this.nom = nom;
		}
		
		public void setprenom(String prenom)
		{
			this.prenom = prenom;
		}
		
		public void setdateNaiss(String date)
		{
			this.dateNaiss = date;
		}
		
	// Constructeurs

	public Eleve()
{
		code = 1;
		nom = "PEAN";
		prenom = "Valentin";
		dateNaiss = "28/03/1994";
}

/**
* Constructeur a partir de parametres
*
* @param code
* @param nom
* @param prenom
* @param dateNaiss
*/

	public Eleve(int code, String nom, String prenom, String dateNaiss)
	{
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
	}

	// methodes


	public String toString()
	{
		return ( "code : " + code + ", nom : " + nom + ", prenom : " + prenom + ", date de naissance : " + dateNaiss);
	}

}


