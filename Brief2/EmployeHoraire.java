package briefpoo;

public class EmployeHoraire extends Employe{
	private int nombreHeure = 1000;
	private int tauxHoraire = 10;
	//private double calsalaire;

	public EmployeHoraire(String nom, String prenom, String date, int salaireHoraire ) {
		super(nom, prenom, date);
		
	}


	/**
	 * @param nom
	 * @param prenom
	 * @param date
	 */
	public EmployeHoraire(String nom, String prenom, String date) {
		super(nom, prenom, date);
		// TODO Auto-generated constructor stub
	}
	public int getNombreHeure() {
		return nombreHeure;
	}
	public void setNombreHeure(int nombreHeure) {
		this.nombreHeure = nombreHeure;
	}
	public int getTauxHoraire() {
		return tauxHoraire;
	}
	public void setTauxHoraire(int tauxHoraire) {
		this.tauxHoraire = tauxHoraire;
	}
	@Override
	public double calsalaire() {
		// TODO Auto-generated method stub
		return nombreHeure*tauxHoraire;
	}


	@Override
	public String toString() {
		return "\r\n Nom :     " + super.getNom() + "\r\n Prenom :   " + getPrenom() + "\r\n Date :    " + getDate() +  "\r\n Salaire : "+ calsalaire() + " Dh";
	}





}
