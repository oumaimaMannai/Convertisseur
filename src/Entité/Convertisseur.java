package Entité;

public class Convertisseur {
	private double Montant, Resultat;
	private UniteDistincteException e ;

	public double getMontant() {
		return Montant;
	}

	public void setMontant(double montant) {
		Montant = montant;
	}

	public double getResultat() {
		return Resultat;
	}

	public void setResultat(double resultat) {
		Resultat = resultat;
	}

	public Convertisseur(double montant) {
		super();
		Montant = montant;
	}	
	
	public void Convertir(double Taux) {
		if (Taux != 0) {
			Taux = Taux * Montant;	
			Resultat = Taux;
		}else {
			e = new UniteDistincteException();
			Resultat = Montant;
			System.err.println(e);
		}		
	}
}
