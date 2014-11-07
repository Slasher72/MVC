package tests;
import classes.Division;

public class TestsDivision {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Division maDiv = new Division();
		Division newDiv = new Division( 2, "BTS2");
		
		System.out.println(maDiv.toString());
		System.out.println(newDiv.toString());
		
		maDiv.setcode(6);
		System.out.println(maDiv.getcode());
		
		maDiv.setlibelle("BTS1");
		System.out.println(maDiv.getlibelle());
		
	
		System.out.println();
	}

}
