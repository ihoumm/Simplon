	package briefpoo;
	
	public class EmployeComission extends Employe {
		private double salaireF;
		private double Comission;
		private double taux;
		
		
	
		public EmployeComission(String nom, String prenom, String date, double salaireF,double Comission, double taux ) {
			super(nom, prenom, date);
			this.salaireF=salaireF;
			this.Comission=Comission;
			this.taux=taux;
			
		}
	
		public Double getSalaireComission() {
			return Comission;
		}
	
		public void setSalaireComission(Double salaireComission) {
			this.Comission = salaireComission;
		}
	
	

		@Override
		public double calsalaire() {
			// TODO Auto-generated method stub
			return (salaireF+(Comission*taux));
		}

		@Override
		public String toString() {
			return "\r\n Nom :       " + super.getNom() + "\r\n Prenom :   " + getPrenom() + "\r\n Date :      " + getDate() +  "\r\n Salaire :   " + calsalaire() + " DH";
		}
		
	
	}
