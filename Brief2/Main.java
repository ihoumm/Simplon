package briefpoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employe emp = new Employe("Mustapha", "Ihoum", "1997");
		
		EmployeFixe empf = new EmployeFixe(" Mustapha", " Ihoum", " 1997", 9000.00);
		
	 EmployeComission empc = new EmployeComission("Abdelali", " Charf", "1995", 6000, 20, 10);
		//EmployeComission empC = new EmployeComission(" Nom : Mustapha", " Prenom : Ihoum", " Date : 1997", 4000 + 5 * 10 );
		
		
	 EmployeHoraire empH= new EmployeHoraire("Omar", "Dbaa", "1994");
		//EmployeHoraire empH= new EmployeHoraire(" Nom : Mustapha", " Prenom : Ihoum", " Date : 1997" );
		System.out.println("***************Employee Fixe***************");
		System.out.println();
		System.out.println(empf.toString());
		System.out.println();
		System.out.println("***************Employee Commission***************");
		System.out.println();
		System.out.println(empc);
		System.out.println();
		System.out.println("***************Employee Horaire***************");
		System.out.println();
		System.out.println(empH);
		System.out.println();
		System.out.println("*****************************************");
	}

}
