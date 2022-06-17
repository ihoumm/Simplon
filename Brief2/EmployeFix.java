package briefpoo;

public class EmployeFixe extends Employe {

	private Double salaire;

	public EmployeFixe(String nom, String prenom, String date, Double salaire) {
		super(nom, prenom, date);
		this.salaire = salaire;
	}

	public Double getSalaire() {
		return salaire;
	}

	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}


	@Override
	public double calsalaire() {
		// TODO Auto-generated method stub
		return salaire;
	}

	@Override
	public String toString() {
		return "\r\n Nom :      " + super.getNom() + "\r\n Prenom :   " + getPrenom() + "\r\n Date :     " + getDate() +  "\r\n Salaire :   " + calsalaire() + " DH";
	}
	
	
}
