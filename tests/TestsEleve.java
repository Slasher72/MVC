package tests;

import classes.Eleve;

public class TestsEleve {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Eleve monEleve = new Eleve();
		Eleve newEleve = new Eleve( 2, "LOCQUET", "Romain", "12/03/1994");
		
		System.out.println(monEleve.toString());
		System.out.println(newEleve.toString());
		
		monEleve.setcode(3);
		System.out.println(monEleve.getcode());
		
		monEleve.setnom("MONKEY D");
		System.out.println(monEleve.getnom());
		
		monEleve.setprenom("Luffy");
		System.out.println(monEleve.getprenom());
		
		monEleve.setdateNaiss("14/10/1994");
		System.out.println(monEleve.getdateNaiss());
		
	
		System.out.println();

	}

}
