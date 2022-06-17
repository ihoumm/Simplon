package briefpoo;


public abstract class Employe {
				
				private String nom;
				private String prenom;
				private String date;
				
				public Employe(String nom, String prenom, String date) {
					this.nom = nom;
					this.prenom = prenom;
					this.date = date;
				}
				
				public abstract double calsalaire();
				public String getNom() {
					return nom;
				}
				public void setNom(String nom) {
					this.nom = nom;
				}
				public String getPrenom() {
					return prenom;
				}
				public void setPrenom(String prenom) {
					this.prenom = prenom;
				}
				public String getDate() {
					return date;
				}
				public void setDate(String date) {
					this.date = date;
				}
				@Override
				public String toString() {
					return "" + nom + ", " + prenom + ", " + date;
				}


				
				
}
			



















			
				
				//constructeur avec le parametre nom
				/*public Employee(String nom, String prenom) {
					super();
					this.nom = nom;
					this.prenom = prenom;
				}
			
				public Employee(String nom, String prenom, String i, double salaireFixe, double salaireComission, double salaireHoraire) {
					// TODO Auto-generated constructor stub
					super();
					this.nom = nom;
					this.prenom = prenom;
					this.date = i;
					this.salaireFixe =salaireFixe;
					this.salaireComission = salaireComission;
					this.salaireHoraire = salaireHoraire;
				}
				public String getNom() {
					return nom;
					
				}
			
				public void setNom(String nom) {
					this.nom = nom;
					
				}
				@Override
				public String toString() {
					return "Employee Fixe \r\n \r\n nom : " + nom + "\r\n prenom : " + prenom + " \r\n age : " + date  + " \r\n Salaire fixe : " + salaireFixe + " Dh ";
				
					
				}
					

*/	

package briefpoo;


public abstract class Employe {
				
				private String nom;
				private String prenom;
				private String date;
				
				public Employe(String nom, String prenom, String date) {
					this.nom = nom;
					this.prenom = prenom;
					this.date = date;
				}
				
				public abstract double calsalaire();
				public String getNom() {
					return nom;
				}
				public void setNom(String nom) {
					this.nom = nom;
				}
				public String getPrenom() {
					return prenom;
				}
				public void setPrenom(String prenom) {
					this.prenom = prenom;
				}
				public String getDate() {
					return date;
				}
				public void setDate(String date) {
					this.date = date;
				}
				@Override
				public String toString() {
					return "" + nom + ", " + prenom + ", " + date;
				}


				
				
}
			



















			
				
				//constructeur avec le parametre nom
				/*public Employee(String nom, String prenom) {
					super();
					this.nom = nom;
					this.prenom = prenom;
				}
			
				public Employee(String nom, String prenom, String i, double salaireFixe, double salaireComission, double salaireHoraire) {
					// TODO Auto-generated constructor stub
					super();
					this.nom = nom;
					this.prenom = prenom;
					this.date = i;
					this.salaireFixe =salaireFixe;
					this.salaireComission = salaireComission;
					this.salaireHoraire = salaireHoraire;
				}
				public String getNom() {
					return nom;
					
				}
			
				public void setNom(String nom) {
					this.nom = nom;
					
				}
				@Override
				public String toString() {
					return "Employee Fixe \r\n \r\n nom : " + nom + "\r\n prenom : " + prenom + " \r\n age : " + date  + " \r\n Salaire fixe : " + salaireFixe + " Dh ";
				
					
				}
					

*/	

