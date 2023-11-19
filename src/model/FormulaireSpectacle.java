package model;

public class FormulaireSpectacle extends Formulaire {
    private static int numeroPlace;
	private int numeroZone;
    private int numeroChaise;

    public FormulaireSpectacle(int jour, int mois, int numeroZone, int numeroChaise) {
        super(jour, mois, numeroPlace);
        this.numeroZone = numeroZone;
        this.numeroChaise = numeroChaise;
    }

    public int getNumeroZone() {
        return numeroZone;
    }

    public int getNumeroChaise() {
        return numeroChaise;
    }

    @Override
    public String toString() {
        return "Le " + jour + "/" + mois + "\nPlace de spectacle " + IdentificationEntite +
               " dans la zone " + numeroZone + " à la chaise " + numeroChaise + ".";
    }
}
