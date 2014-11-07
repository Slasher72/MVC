package classes;

/**
* Division est la classe regroupant le code et le libelle d'une division
*
* @author PEAN Valentin
* @version 1.0
*/

public class Division {

	private int code;
	private String libelle;

	//Accesseurs

/**
 * Accesseur du code d'une division
* @return Code de la division (int)
*/

		public int getcode()
		{
			return code;
		}

/**
* Accesseur du libelle de la division
* @return Libelle de la division (String)
*/

		public String getlibelle()
		{
			return libelle;
		}

	//Modifieurs


		public void setcode(int code)
		{
			this.code = code;
		}

		public void setlibelle(String libelle)
		{
			this.libelle = libelle;
		}
	// Constructeurs

	public Division()
{
		code = 1;
		libelle = "Seconde";
}

/**
* Constructeur a partir de parametres
*
* @param code
* @param libelle
*/

	public Division(int code, String libelle)
	{
		this.code = code;
		this.libelle = libelle;
	}

	// methodes


	public String toString()
	{
		return ( "code : " + code + " libelle : " + libelle);
	}

}


